//check if string is palindrome or not?
public class Question103mod {
    public static void main(String[] args) {
        String a="ABA";
//        int x=0,y=a.length()-1;
//        while (x<y){
//            if (a.charAt(x)==a.charAt(y)){
//                x++;
//                y--;
//            }
//        }
//        if (x>y){
//            System.out.println("Yes");
//        }else
//            System.out.println("no");
        System.out.println(Question103mod.isPlaindrome(a));
    }
    public static boolean isPlaindrome(String s) {
        int i=0 ,j=s.length()-1;
        while (i<j){
            if (s.charAt(i++)!=s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
