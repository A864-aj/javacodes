public class Question105 {
    public static void main(String[] args) {
        String s="Hello Brother apki gand";
        int c=0,v=0;
        for (char ch:s.toCharArray()){
            switch (ch){
                case 'a','e','i','o','u' -> v++;
                default -> c++;
            }
        }
        System.out.println(v+" "+c);
    }
}
