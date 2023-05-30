//Accept two numbers from user and swap their values
//      Part 2 - Swap without using third variable
public class Question28 {
    public static void main(String[] args) {
        int a=10 ,b=12;
        int c=20 , d=30;
        int temp;
        //Swapping - Use this method in questions
        temp=a;
        a=b;
        b=temp;

        //Another method
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println(c);
        System.out.println(d);

    }
}
