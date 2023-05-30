import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
    int a=sc.nextInt();
        System.out.println("Enter second number");
    int b = sc.nextInt();
    char c =sc.nextLine().charAt(0);
        System.out.println(c);
        System.out.println("The sum is "+ (a+b));


    }
}
/*
1) Which package is imported by default in java ?
ans-- java.lang
2) What is Scanner ?
ans-- Scanner is a class present in util package of java ,which is used for taking input from the user.

----------------------------------------------------------------------------------------------------------
-Use methods to read respective data
		--nextByte(), nextShort(), nextInt(), nextLong(),
		nextFloat(), nextDouble(), nextBoolean()

--Reading String Data--
		--nextLine() - Reads the whole line
		--next()     - Reads the first word

--Reading char data--
		--nextLine().charAt(0)
		--Problem with nextLine method
		--If nextLine is used right after any scanner method then it will not work properly.
		--Remember to use a dummy nextLine method after reading nextXYZ data
		  which will pick the newline character

 */