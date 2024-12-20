public class IMP_Q1456 {    
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public static int maxVowels(String s, int k) {
       int maxCount,currentCount=0;
       for (int i=0;i<k;i++){
        if(isVowel(s.charAt(i))){
            currentCount+=1;
        }
       }
       maxCount = currentCount;

       for(int i=k;i<s.length();i++){
        if(isVowel(s.charAt(i-k))){
            currentCount-=1;
        }

        if(isVowel(s.charAt(i))){
            currentCount+=1;
        }

        maxCount = Integer.max(maxCount,currentCount);
       }

       return maxCount;
    }
    public static void main(String[] args) {
        String s = "aeiou";
        int k=2;
        int ans = maxVowels(s, k);
        System.out.println(ans);
    }
}
