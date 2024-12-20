// import java.util.Stack;

public class IMP_Q2390 {
    public static String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for(char i:s.toCharArray()){
            if(i!='*'){
                res.append(i);
            }
            else{
                res.deleteCharAt(res.length()-1);
            }
        }
        return res.toString();
    //   Stack<Character> stk = new Stack<>(); 
    //   for(char i:s.toCharArray()){
    //     if(i!='*'){
    //         stk.push(i);
    //     }
    //     else{
    //         if(!stk.isEmpty()){
    //         stk.pop();
    //         }
    //   } 
    // }
    //   StringBuilder res = new StringBuilder();
    //   while(!stk.isEmpty()){
    //     res.append(stk.pop());
    //   }
    //   return res.reverse().toString();
    }

    public static void main(String[] args) {
        String s ="erase*****";
        String ans = removeStars(s);
        System.out.println(ans);
    }
}
