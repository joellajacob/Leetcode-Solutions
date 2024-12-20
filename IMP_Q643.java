public class IMP_Q643 {
    public static double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        int currentSum = 0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            currentSum+=nums[i];
        }
        maxSum=currentSum;
        for(int i=k;i<nums.length;i++){
            currentSum = currentSum - nums[i-k]+ nums[i]; //adding next ele (nums[i]) and removing previous ele (nums[i-k])
            maxSum=Integer.max(maxSum,currentSum);
        }
        return (double)maxSum/k;
        
    } 
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        int k = 4;
        double ans = findMaxAverage(nums,k);
        System.out.println(ans);
    }
}
