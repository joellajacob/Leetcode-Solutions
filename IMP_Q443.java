import java.util.Arrays;
public class IMP_Q443 {
    public static int compress(char[] chars) {
        if(chars.length<2){
            return chars.length;
        }
        int read=0,write=0,count;
        char ch;
        for(read=0;read<chars.length;){
            ch=chars[read];
            chars[write]=ch;
            write+=1;
            count=1;
            for(int i=read+1;i<chars.length;i++){ //counting the group's length
                if(chars[i]==ch){
                    count+=1;
                }
                else{
                    break;
                }
            }
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
            
            read+=count;            
        }
        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int ans = compress(chars);
        System.out.println(ans);
        System.out.println(Arrays.toString(chars));
    }
}
