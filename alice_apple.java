//class Solution {
//    public long minimumPerimeter(long neededApples) {
//        long n=0;
//        long sum = 0;
//        while(neededApples > sum){
//            n++;
//            sum += 12*n*n;
//        }
//        return(8*n);
//    }
//}
import java.util.Scanner;

public class alice_apple{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int need = inp.nextInt();
        int sum = 0;
        int x=0;
        while(need>sum){
            x++;
            sum = sum+(12*x*x);
        }
        System.out.println(8*sum);
    }
}

