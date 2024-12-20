import java.util.Arrays;
import java.util.Stack;

public class IMP_Q735 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int i: asteroids){
            if(stk.isEmpty()){
                stk.push(i);
            }
            else if(stk.peek()>0 && i>0){
                stk.push(i);
            }
            else{
                int as1=Math.abs(stk.peek());
                int as2=Math.abs(i);
                if(as1-as2==0){
                    stk.pop();
                }
                else if(as2>as1){
                    stk.pop();
                    stk.push(i);
                }
            }
        }
        int[] res = new int[stk.size()];
        for(int i=stk.size()-1;i>=0;i--){
            res[i]=stk.pop();
        }
        return res;

    }
    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        int[] res = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(res));
    }
}
