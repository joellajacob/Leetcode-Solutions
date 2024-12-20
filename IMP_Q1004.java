public class IMP_Q1004 {
    public static int longestOnes(int[] nums, int k) {
        int maxCount=0,zeroCount=0,start=0,end=0;

        /*  - initially window size =0
            -keep iterating and finding zeroes, while incrementing zerocounter.
            -when zer0counter > k(no of zero flipped), then shrink the window size till zerocounter = flipped
            -find the maxcount for each time we shrink/increase the window
            -then you keep checking for zeroes and the condition of zerocounter>k till end==num.length
         */

        while(end<nums.length){ //count number of zeroes
            if(nums[end]==0){
                zeroCount+=1;
            }
            end+=1;
        while(zeroCount>k){
            if(nums[start]==0){
                zeroCount-=1;
            }
            start+=1;
        }
        maxCount=Integer.max(maxCount,end-start);
    }
        return maxCount; //end-start and not end-start-1 since while iterating the array for zeroes, end = nums.length , not nums.length-1;

        //INITIAL APPROACH
        // int currentCount=0,maxCount=0,flipLeft=k;
        // int start=0,end=0;
        // while(end<nums.length){
        //     if(nums[end]==1){
        //         currentCount+=1;
        //         end+=1;
        //     }
        //     else if(nums[end]==0 && flipLeft>0){
        //         currentCount+=1;
        //         end+=1;
        //         flipLeft-=1;
        //     }
        //     else{
        //         if(nums[start]==1){
        //             currentCount-=1;
        //         }
        //         else{
        //             flipLeft+=1;
        //             currentCount-=1;
        //         }
        //         start+=1;
        //     }

        //     maxCount=Integer.max(maxCount,currentCount);
        // }
        // return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int ans = longestOnes(nums, k);
        System.out.println(ans);
    }
}
