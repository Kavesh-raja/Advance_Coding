public class remainder{
    public static int calc(int n, int div[],int rem[]){
        int x=1;
        int i;
        while(true){
            for(i=0;i<n;i++){
                if(x%div[i]!=rem[i]){
                    break;
                }
            }
            if(i==n){
                return x;
            }
            x++;
        }
    }

    public static void main(String[] args) {
        int n=3;
        int[] div = {3,5,7};
        int[] rem = {2,3,2};
        System.out.println(calc(n,div,rem));
    }
}
