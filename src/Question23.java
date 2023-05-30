import java.util.Scanner;
public class Question23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount=sc.nextInt();
        int discount;
        if(amount>5000 && amount<=7000){
            discount=(amount*10)/100;
            amount=amount-discount;
            System.out.println("Amount after discount is "+amount);
        }else if (amount>7000 && amount<=10000) {
            discount=(amount*20)/100;
            amount=amount-discount;
            System.out.println("Amount after discount is "+amount);
        }else if (amount>10000) {
            discount=(amount*30)/100;
            amount=amount-discount;
            System.out.println("Amount after discount is "+amount);
        }else {
            System.out.println("Amount after no discount "+amount);
        }
    }
}
