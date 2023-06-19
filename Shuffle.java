public class Shuffle {
    public static String shuffle(String s, int[] indexis){
    char[] res = new char[indexis.length];
    for(int i = 0; i <indexis.length; i++){
        res[indexis[i]] = s.charAt(i);
    }
    return  new String(res);
    }

    public static void main(String[] args) {
        System.out.println(shuffle("codeleet", new int[] {4, 5, 6, 7, 0, 2, 1, 3}));
        System.out.println(shuffle("abc", new int[] {0, 1, 2}));
    }
}
