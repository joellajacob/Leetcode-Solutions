public class IMP_Q11 {
    public static int maxArea(int[] height) {
        int area=Integer.MIN_VALUE;
        int start=0,end=height.length-1;
        while(start<end){
            if(height[start]>height[end]){
                int res=(end-start)*height[end];
                area=Integer.max(area,res);
                end-=1;
            }
            else{
                int res=(end-start)*height[start];
                area=Integer.max(area,res);
                start+=1;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int ans=maxArea(height);
        System.out.println(ans);
    }
}
