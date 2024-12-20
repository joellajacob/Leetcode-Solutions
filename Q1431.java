import java.util.*;
public class Q1431 {

    public static int maxValue(int[] x){
        int max=x[0];
        for(int i=1;i<x.length;i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        return max;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int max = maxValue(candies);
        int p=0;
        while(p<candies.length){
            l.add(candies[p]+extraCandies>=max);
            p+=1;
        }
        return l;
    }
    public static void main (String args[]){
        int[] candies={2,3,5,1,3};
        int extra = 3;
        List<Boolean> lst = kidsWithCandies(candies,extra);
        System.out.println(lst);
    }
}
