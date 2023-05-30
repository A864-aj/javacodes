//check if string is palindrome or not?
public class Question103 {
    public static void main(String[] args) {
        String a="ABA";
        String rev ="";
        for (int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        System.out.println(a.equals(rev)?"Yes":"No");
    }
}
