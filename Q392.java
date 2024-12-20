public class Q392 {
    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int ps=0,pt=0;
        while(ps<s.length() && pt<t.length()){
            if(s.charAt(ps) == t.charAt(pt)){
                ps+=1;
                pt+=1;
            }
            else{
                pt+=1;
            }
            
        }
        if(ps==s.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="ace";
        String t="";
        boolean ans=isSubsequence(s,t);
        System.out.println(ans);
    }
}
