// import java.util.Arrays;
public class Q724 {

    public static int pivotIndex(int[] nums) {
       int[] leftSum = new int[nums.length];
       int[] rightSum = new int[nums.length];
       leftSum[0] = rightSum[nums.length-1]=0;
       //for left sum
       for(int i=1;i<nums.length;i++){
        leftSum[i]=leftSum[i-1]+nums[i-1];
       }
       //for right sum
       for(int i=nums.length-2;i>=0;i--){
        rightSum[i]=rightSum[i+1]+nums[i+1];
       }

    //    System.out.println(Arrays.toString(leftSum));
    //    System.out.println(Arrays.toString(rightSum));
       for(int i=0;i<nums.length;i++){
        if(leftSum[i]==rightSum[i])
            return i;
       }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int pivot = pivotIndex(nums);
        System.out.println(pivot);
    }
}
