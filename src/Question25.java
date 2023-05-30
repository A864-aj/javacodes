//
import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Paisa Dalo ");
        int amount=sc.nextInt();
        int note2000=0, note500=0, note200=0,
                note100=0, note50=0, note20=0, note10=0, note5=0, note2=0, note1=0;
        if(amount>=2000){
            note2000=amount/2000;
            amount=amount%2000;
        }if(amount>=500){
            note500=amount/500;
            amount=amount%500;
        }if(amount>=200){
            note200=amount/200;
            amount=amount%200;
        }if(amount>=100){
            note100=amount/100;
            amount=amount%100;
        }if(amount>=50){
            note50=amount/50;
            amount=amount%50;
        }if(amount>=20){
            note20=amount/20;
            amount=amount%20;
        }if(amount>=10){
            note10=amount/10;
            amount=amount%10;
        }if(amount>=5){
            note5=amount/5;
            amount=amount%5;
        }if(amount>=2){
            note2=amount/2;
            amount=amount%2;
        }if(amount==1){
            note1=amount;
        }
        System.out.println("2000 ke "+ note2000);
        System.out.println("500 ke "+ note500);
        System.out.println("200 ke "+note200);
        System.out.println("100 ke "+note100);
        System.out.println("50 ke "+note50);
        System.out.println("20 ke "+note20);
        System.out.println("10 ke "+note10);
        System.out.println("5 ke "+note5);
        System.out.println("2 ke "+note2);
        System.out.println("1 ke "+note1);
    }
}
