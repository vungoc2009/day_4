public class Bai_1 {

    public static  boolean checkReverse (int n){
        String a = Integer.toString(n);
        int b = a.length();
        for (int i = 0; i < b/2; i++) {
            if(a.charAt(i) != a.charAt(b-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 100000; i < 999999 ; i++) {
            if(checkReverse(i)){
                System.out.println(i);
            }
        }
    }
}
