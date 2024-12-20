public class Q334 {
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int start=0,end=2;
        while(end<nums.length){
            if(nums[start]<nums[start+1] && nums[start+1]<nums[end]){
                return true;
            }
            else if (nums[start]>nums[start+1]){
                start+=1;
                end+=1;
            }
            else if(nums[start+1]>nums[end]){
                start=end;
                end+=2;
            }
        }
       return false; 
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        boolean ans = increasingTriplet(nums);
        System.out.println(ans);
    }
}
