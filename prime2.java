import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int l = inp.nextInt();
        int h = inp.nextInt();
        boolean[] prime = new boolean[h-l+1];
        int mb;

        for(int i=2;i<=Math.sqrt(h);i++){
            mb=(l/i)*i;
            if(mb<l){
                mb=mb+i;
            }
            for(int j=mb;j<=h;j=j+i){
                prime[j-l]=true;
            }
        }
        for(int k =0;k<(h-l+1);k++){
            System.out.println(l+k);
            //System.out.println();
            if(prime[k]==false){
                System.out.println();
                System.out.println(l+k);
            }
        }
        //System.out.println((Arrays.toString(prime)));
    }
}
