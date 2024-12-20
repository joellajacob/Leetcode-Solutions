import java.util.HashMap;
public class IMP_Q2352 {

    public static String rowToString(int[] x){
        StringBuilder s= new StringBuilder();
        for(int i:x){
            s.append(i+',');
        }
        return s.toString();

    }

    public static String colToString(int[][] grid,int col){
        StringBuilder s= new StringBuilder();
        for(int i=0;i<grid.length;i++){
            s.append(grid[i][col]+',');
        }
        return s.toString();
    }

    public static int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            String row=rowToString(grid[i]);
            map.merge(row,1,Integer::sum);
        }

        int count=0;

        for(int i=0;i<grid.length;i++){
            String col = colToString(grid, i);
            if(map.containsKey(col)){
                count+=map.getOrDefault(col, 0);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        int ans = equalPairs(grid);
        System.out.println(ans);
    }
}
