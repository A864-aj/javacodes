public class Question111 {
    public static void main(String[] args) {
        String s="original";
        System.out.println(Question111.firstSecond(s));
    }
    public static String firstSecond(String s) {
        String first="";
        String second ="";
        for (int i = 0; i <s.length();i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                first=first+c;
            }
            else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                first=first+c;
            }
            else {
                second=second+c;
            }
        }
        return first+second;
    }
}
