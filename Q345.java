public class Q345 {
    
    public static boolean isVowel(Character ch){
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public static String reverseVowels(String s) {
        char[] rev=s.toCharArray();
        int p1=0,p2=rev.length-1;
        while(p1<p2){
           if(isVowel(rev[p1]) && isVowel(rev[p2])){
            char temp=rev[p1];
            rev[p1]=rev[p2];
            rev[p2]=temp;
            p1+=1;
            p2-=1;
           }
           else{
            if(!isVowel(rev[p1])){
                p1+=1;
            }
            if(!isVowel(rev[p2])){
                p2-=1;
            }
           }           
       }
        return String.valueOf(rev);
    }

    public static void main(String[] args) {
        String str="IceCreAm";
        String ans=reverseVowels(str);
        System.out.println(ans);
    }
}
