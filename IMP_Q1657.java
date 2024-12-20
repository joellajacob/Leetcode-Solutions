// import java.util.HashMap;
import java.util.Arrays;
// import java.util.Collections;

public class IMP_Q1657 {
    public static boolean closeStrings(String word1, String word2) {
        /*SOLUTION ONE: faster because of fixed array size */
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] occurence1 = new int[26]; //for all alphabets in word1
        int[] occurence2 = new int[26]; //for all alphabets in word2

        for(char i : word1.toCharArray()){
            occurence1[i-'a']+=1;
        }
        // System.out.println(Arrays.toString(occurence1));

        for(char i : word2.toCharArray()){
            occurence2[i-'a']+=1;
        }

        for(int i=0;i<26;i++){
            if((occurence1[i]==0 && occurence2[i]!=0)||(occurence1[i]!=0 && occurence2[i]==0)){
                return false;
            }
        }
        
        Arrays.sort(occurence1);
        Arrays.sort(occurence2);
        return Arrays.equals(occurence1,occurence2);

        /*SOLUTION TWO:
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char i: word1.toCharArray()){
            map1.merge(i,1,Integer::sum);
        }
        for(char i: word2.toCharArray()){
            map2.merge(i,1,Integer::sum);
        }
        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }
        
        int[] arr1 = new int[map1.size()];
        int[] arr2 = new int[map2.size()];
        
        int index=0;
        for(int i:map1.values()){
            arr1[index]=i;
            index+=1;
        }
        
        index=0;
        for(int i:map2.values()){
            arr2[index]=i;
            index+=1;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Integer> l2 = new ArrayList<>();
        // l1.addAll(map1.values());
        // l2.addAll(map2.values());
        // Collections.sort(l1);
        // Collections.sort(l2);
        return Arrays.equals(arr2,arr1);
        */
    }
    public static void main(String[] args) {
        String word1= "cabbba";
        String word2="abbccc";
        boolean ans = closeStrings(word1, word2);
        System.out.println(ans);
    }
}
