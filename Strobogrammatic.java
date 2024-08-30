import java.util.*;
public class Strobogrammatic {
    public static boolean check(String num){
        if(num==null||num.length()==0){
            return true;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('9','6');
        map.put('6','9');

        int start = 0;
        int end = num.length()-1;

        while(start<=end){
            if(num.charAt(start)!=map.get(num.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        System.out.println(check(str));


    }
}
