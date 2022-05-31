import java.util.Scanner;

public class Bai_4 {
    public static void maxString (String a){
        a = a.trim();
        a = a.replaceAll("\\s"," ");
        String []str = a.split(" ");
        int max =0 ;
        String b = "";
        for (int i = 0; i < str.length; i++) {
            int n = str[i].length();
            if (n>max){
                max = n;
            }
            if(max == str[i].length()){
                b= str[i];
            }
        }
        System.out.println(b);
        System.out.println("vi tri cua chuoi là "+ a.indexOf(b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        maxString(a);
    }
}
