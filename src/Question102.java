public class Question102 {
    public static void main(String[] args) {
        String a="Anurag Gurjar";
        String rev ="";
        for (int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        System.out.println(rev);
    }
}
