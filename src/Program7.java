//Operators in java --
public class Program7 {
    public static void main(String[] args) {
            int a= 5;
            int b= 3;
            int c= -2;
            int d= -c;
            float e= 9.223f;
            float f= 2.11f;

        // Arithmatic Operators -: (+, -, *, /, %, ++, --)
            int plus = a+b;
            int minus =a-b;
            int increment = a++ ; //++ and -- operators cannot be applied on boolean type
            int decrement = b--;
            int multiply = a*b;
            int divide = c/d;
            int modulo =a%c;
           float mod=e%f; //Modulo on floats (produces unambiguity)
                            //--It can give garbage value sometimes

       //****The below trick is IMPORTANT****
            int res = 7385%10; // This will give last digit as output = 5
            int div = 7385/10; // This will remove the last digit and give remaining value = 738
            System.out.println(res);
            System.out.println(div);


    }
}
/*
Points to remember--
                            OPERATORS
                   -----------------------------
1)Unary Operators -- Unary operators are those operations which
                     can work on both single and double operands.
                     Example-- a+b , +b , ++a , -c

2)Binary Operators -- Binary operators are those operators which
                      needs two operands to work.
                      Example-- a+b , a-b , a*b , a/b ,a%b , a<b , a==b .

------------------------------------------------------------------------------------------------
--Arithmatic Operators -: (+, -, *, /, %, ++, --)
			--int/int will always yields int
			--Modulo can work with int (works perfactly) as well as floats (produces unambiguity)
			--Increment/Decrement operators can only be applied on variables, not on constants.
			--Pre	++a
			--Post       a++
			--Special powers of / & %
				--/ to reduce the number
				--% to get last digit(s) of number
-------------------------------------------------------------------------------------------------

--Relational <, >, <=, >=, ==, !=
			--These returns values in boolean - true or false

-------------------------------------------------------------------------------------------------
--Logical &&, ||, !
			--Used to combine multiple conditions
		--ShortHand operators
		--Precedence and Associativity of Operators
		--Rest to be covered later like bitwise and shift operators

 */
