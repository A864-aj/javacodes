import java.util.Scanner;
public class Question55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cusiene,dish,bill=0;
        do {
            System.out.println("==================================");
            System.out.println("1 : Indian");
            System.out.println("2 : South Indian");
            System.out.println("3 : Chinese");
            System.out.println("4 : Italian");
            System.out.println("0 : To EXIT and Generate Bill");
            System.out.println("==================================");
            cusiene= sc.nextInt();
            switch (cusiene){
                case 1 ->{
                    System.out.println("==================================");
                    System.out.println("1 : Chole Kulche Rs.80");
                    System.out.println("2 : Chole Bhature Rs.70");
                    System.out.println("3 : Pav Bhaji Rs.60");
                    System.out.println("4 : Paneer Kulche Rs.80");
                    System.out.println("==================================");
                    dish= sc.nextInt();
                    switch (dish){
                        case 1->{
                            System.out.println("Chole Kulche");
                            bill +=80;
                        }
                        case 2->{
                            System.out.println("Chole Bhature");
                            bill +=70;
                        }
                        case 3->{
                            System.out.println("Pav Bhaji");
                            bill +=60;
                        }
                        case 4->{
                            System.out.println("Paneer Kulche");
                            bill +=80;
                        }
                    };
                }case 2 ->{
                    System.out.println("==================================");
                    System.out.println("1 : Idli Sambhar Rs.80");
                    System.out.println("2 : Dosa Rs.70");
                    System.out.println("3 : Masala Dosa Rs.60");
                    System.out.println("4 : Idli Fried Rs.80");
                    System.out.println("==================================");
                    dish= sc.nextInt();
                    switch (dish){
                        case 1->{
                            System.out.println("Idli Sambhar");
                            bill +=80;
                        }
                        case 2->{
                            System.out.println("Dosa");
                            bill +=70;
                        }
                        case 3->{
                            System.out.println("Masala Dosa");
                            bill +=60;
                        }
                        case 4->{
                            System.out.println("Idli Fried");
                            bill +=80;
                        }
                    };
                }case 3 ->{
                    System.out.println("==================================");
                    System.out.println("1 : Noodles Rs.80");
                    System.out.println("2 : Manchuriyan Rs.70");
                    System.out.println("3 : Fried Rice Rs.60");
                    System.out.println("4 : Chilli Paneer Rs.80");
                    System.out.println("==================================");
                    dish= sc.nextInt();
                    switch (dish){
                        case 1->{
                            System.out.println("Noodles");
                            bill +=80;
                        }
                        case 2->{
                            System.out.println("Manchuriyan");
                            bill +=70;
                        }
                        case 3->{
                            System.out.println("Fried Rice");
                            bill +=60;
                        }
                        case 4->{
                            System.out.println("Chilli Paneer");
                            bill +=80;
                        }
                    };
                }case 4 ->{
                    System.out.println("==================================");
                    System.out.println("1 : Pizza Rs.80");
                    System.out.println("2 : Pasta Rs.70");
                    System.out.println("3 : Garlic Bread Rs.60");
                    System.out.println("4 : Cheese Roll Rs.80");
                    System.out.println("==================================");
                    dish= sc.nextInt();
                    switch (dish){
                        case 1->{
                            System.out.println("Pizza");
                            bill +=80;
                        }
                        case 2->{
                            System.out.println("Pasta");
                            bill +=70;
                        }
                        case 3->{
                            System.out.println("Garlic Bread");
                            bill +=60;
                        }
                        case 4->{
                            System.out.println("Cheese Roll");
                            bill +=80;
                        }
                    };
                }
            }
        }while (cusiene!=0);
        System.out.println("Your bill is -: "+bill);
    }
}
