public class Question110 {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(Question110.halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        int countone = 0;
        int counttwo = 0;
        for (int i = 0; i <(s.length()/2);i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    countone++;
                }
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    countone++;
                }
        }
        for (int i =(s.length()/2); i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    counttwo++;
                }
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    counttwo++;
                }
        }
        return countone==counttwo;
    }
}
