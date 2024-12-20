import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
public class IMP_Q1207 {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.merge(i,1,Integer::sum);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return (map.size() == set.size());
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        boolean ans = uniqueOccurrences(arr);
        System.out.println(ans);
        
    }
}
