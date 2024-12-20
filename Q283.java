import java.util.Arrays;
public class Q283 {
    public static void moveZeroes(int[] nums) {
        int zero_p=0,nonzero_p=0;
        while(nonzero_p<nums.length){
            if(nums[nonzero_p]!=0 && nonzero_p!=zero_p){
                int temp = nums[nonzero_p];
                nums[nonzero_p]=nums[zero_p];
                nums[zero_p]=temp;
                zero_p+=1;
                nonzero_p+=1;
            }
            else{
                nonzero_p+=1;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,0,0,2,0,12,6,0,0,5};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
