import java.util.Scanner;

public class Question106 {
    public static void main(String[] args) {
        String s="aAbcDE123* fgH";
        String op="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch>=65 && ch<=90){
                op=op+(char)(ch+32);
            }else if(ch>=97 && ch<=122) {
                op=op+(char)(ch-32);
            }else {
                op=op+ch;
            }
        }
        System.out.println(s);
        System.out.println(op);
    }
}
