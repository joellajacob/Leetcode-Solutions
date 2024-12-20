// import java.util.Arrays;
public class IMP_Q151 {
    public static String reverseWords(String s) {
        StringBuilder rev = new StringBuilder();
        String[] words = s.trim().split("\s+");
        // System.out.println(Arrays.toString(words));
        int i=words.length -1;
        while(i>=0){
          rev.append(words[i]);
          if(i!=0){
            rev.append(" ");
          }
          i-=1;
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String str = " the sky12 is  blue ";
        String ans=reverseWords(str);
        System.out.println(ans);
    }
}
