import java.util.Arrays;
public class IMP_Q238 {
    public static int[] productExceptSelf(int[] nums){
        int n=nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0]=suffix[n-1]=1;

        // //initialise each with 1 (for multiplication)
        // for(int i=0;i<n;i++){
        //     prefix[i]=suffix[i]=1;
        // }

        //prefix
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        //suffix
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        //product of both arrays

        for(int i=0;i<n;i++){
            suffix[i]=suffix[i]*prefix[i];
        }

        return suffix;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
}
