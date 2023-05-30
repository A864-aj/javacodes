import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        String ans =switch (day){
            case 1 -> "Mon";
            case 2 -> {
                yield  "tue";  //if using { } and wwriting only single line code , we have
                                //to use "yield" keyword , yield is not req. when writing multiple lines
            }
            case 3 -> "wed";
            case 4 -> "thurs";
            default -> "Wrong";
        };
        System.out.println(ans);
    }
}
