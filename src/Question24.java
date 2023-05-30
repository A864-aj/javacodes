import java.util.Scanner;
public class Question24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of units");
        int unit =sc.nextInt();
        double bill=0;
        if(unit>400){
            bill=bill+(unit-400)*13;
            unit=400;
        }
        if (unit>200 && unit<=400 ) {
            bill=bill+(unit-200)*8;
            unit=200;
        }
        if (unit>100 && unit<=200) {
            bill=bill+(unit-100)*6;
            unit=100;
        }if(unit<=100) {
            bill=bill+(unit*4.2);
        }
        System.out.println("Bill is "+bill);

    }
}
