// import java.util.Arrays;
public class Q1732 {
    public static int largestAltitude(int[] gain) {
        int max=0;
        int[] altitude = new int[gain.length+1];
        altitude[0]=0;
        for(int i=1;i<altitude.length;i++){
            altitude[i]= altitude[i-1] + gain[i-1];
            max=Integer.max(max,altitude[i]);
        }
        // System.out.println(Arrays.toString(altitude));
        return max;
    }

    public static void main(String[] args) {
        int[] gain={-4,-3,-2,-1,4,3,2};
        int ans=largestAltitude(gain);
        System.out.println(ans);
    }
}

