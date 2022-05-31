import java.util.Scanner;

public class Bai_6 {
    public static  void sort(String a){
        a= a.trim();
        a = a.replaceAll("\\s"," ");
        String []b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            for (int j = i+1; j <b.length ; j++) {
                if(b[i].compareTo(b[j])>0){
                    String temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";

        do {
            a = sc.nextLine();
            a.trim();
            a.replaceAll("\\s"," ");
            String[] b = a.split(" ");
            if(b.length <= 19) {
                break;
            }
            else {
                System.out.println("nhap lai di");
            }
        }while (true);
        sort(a);
    }
}
