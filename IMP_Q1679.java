import java.util.Arrays;
public class IMP_Q1679 {

    public static int maxOperations(int[] nums, int k) {
        if(nums.length<2){
            return 0;
        }
        int count=0;
        int start=0,end=nums.length-1;
        Arrays.sort(nums);
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==k){
                count+=1;
                start+=1;
                end-=1;
            }
            else if(sum>k){
                end-=1;
            }
            else{
                start+=1;
            }
        }
        return count;
        // alternatively, iterte through the array, check for values>k and make those zero. then sort the array and start from where the zeroes end.
    }

    public static void main(String[] args) {
        int[] nums={3,1,3,4,3};
        int k=6;
        int ans=maxOperations(nums, k);
        System.out.println(ans);
    }
}
