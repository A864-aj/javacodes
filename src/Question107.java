import java.util.Arrays;

public class Question107 {
    public static void main(String[] args) {
        String s="Hello bhai kaise ho";
        String[] words=s.split(" ");
        for (int i=0;i< words.length;i++){
            char ch=words[i].charAt(0);
            String first=Character.toString(ch).toUpperCase();
            String second=words[i].substring(1);
            System.out.println(first+second);
        }
        //System.out.println(Arrays.toString(words));
    }
}
