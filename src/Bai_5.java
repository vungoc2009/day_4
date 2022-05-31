import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai_5 {
    public static void reverse (String a){
        StringTokenizer str = new StringTokenizer(a);
        System.out.println(str.countTokens());
        String ho = "";
        String tenDem = "";
        String ten = "";
        int size = str.countTokens();
        int count = 0;
        while (str.hasMoreTokens()){
            String temp = str.nextToken();
            if(count == 0){
                ho += (temp+" ");
            }else if (count == size-1) {
                ten += (temp+" ");
            }else {
                tenDem += (temp+" ");
            }
            count++;
        }
        a = ten+ho+tenDem;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        reverse(a);
    }
}
