import java.util.List;
import java.util.*;
public class IMP_Q2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        //can't use addAll() since int[] not a collection
        //using sets for removing duplicates
        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }
        // set1.removeAll(set2);
        // set2.removeAll(set1);

        List<Integer> l1 = new ArrayList<>(set1);
        List<Integer> l2 = new ArrayList<>(set2);
        l1.removeAll(set2);
        l2.removeAll(set1);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l1);
        ans.add(l2);

        return ans;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,3};
        int[] nums2 = {1,1,2,2};
        List<List<Integer>> ans = findDifference(nums1,nums2);
        System.out.println(ans);

    }
}
