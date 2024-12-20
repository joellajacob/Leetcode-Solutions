// import java.util.*;
// import java.math.*;
public class IMP_Q1071 {
    public static int gcd(int a, int b){
        //euclids formula --> gcd(a,b) = gcd(b,a%b)
        if(b==0){
            // System.out.println(a);
            return a;
        }
        return gcd(b,a%b);

    }
    public static String gcdOfStrings(String str1, String str2) {
        int len;
        if((str1+str2).equals(str2+str1)){
            len=gcd(str1.length(),str2.length());
            return str1.substring(0,len);
        }
        else{
            return "";
        }
        
    }
    public static void main(String args[]){
        String str1="LEET";
        String str2="CODE";
        String ans=gcdOfStrings(str1, str2);
        System.out.println(ans);

    }
}
