public class Q605 {
    
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
      int i=0;
      while(i<flowerbed.length && n>0){
        if(flowerbed[i]==0){
            if(i!=flowerbed.length-1 && flowerbed[i+1]!=0){
                i+=3;
                continue;
            }
            flowerbed[i]=1;
            n-=1;
        }
        i+=2;
      } 
      
      return (n==0);
    }
    public static void main(String[] args) {
        int n=1;
        int[] flowerbed={0,0,1,0,0};
        boolean ans=canPlaceFlowers(flowerbed,n);
        System.out.println(ans);
    }
}
