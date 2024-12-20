public class Q1768 {

    public static String mergeStrings(String w1, String w2){
        // String merged="";
        StringBuilder merged= new StringBuilder();
        int l1=w1.length(),l2=w2.length();
        int p1=0,p2=0;

        while(p1<l1 && p2<l2){
            merged.append(w1.charAt(p1));
            p1+=1;
            merged.append(w2.charAt(p2));
            p2+=1;
        }

        if(p1<l1){
            merged.append(w1.substring(p1, l1));
        }

        if(p2<l2){
            merged.append(w2.substring(p2, l2));
        }
        return merged.toString();
    }
    public static void main(String args[]){
        // System.out.println("Hello");
        String w1="abc";
        String w2="pqrst";
        String ans=mergeStrings(w1,w2);
        System.out.println(ans);

    }
}

