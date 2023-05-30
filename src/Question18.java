import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double firstroot=0;
        double secondroot=0;
        System.out.println("Enter value of a");
        double a=sc.nextDouble();
        System.out.println("Enter value of b");
        double b=sc.nextDouble();
        System.out.println("Enter value of c");
        double c=sc.nextDouble();

        double disc =(b*b)-4*a*c;
        double sub=Math.sqrt(disc);

        if(disc>0){
            firstroot=(-b-sub)/(2*a);
            secondroot=(-b+sub)/(2*a);
            System.out.println("Roots are "+firstroot+" "+secondroot);

        }
        else if(disc==0) {
            secondroot =(-b+sub)/(2*a);
            System.out.println("Root is "+secondroot);
        }
        else{
            System.out.println("Discriminant is less than 0");
        }
    }
}
