
public class LowerCase {
    public static void main(String[] args) {
        String s = "MaKsIm";
        System.out.println(big(s));
        System.out.println(small(s));
    }
    public static String big(String s){
        String W = s.toUpperCase();
        return W;
    }
    public static String small(String s){
        String W = s.toLowerCase();
        return W;
    }
}
