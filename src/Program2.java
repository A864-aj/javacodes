//IN THIS PROGRAM WE LEARNED ABOUT CONCATINATION and NAMING SYSTEM IN JAVA
public class Program2 {
    public static void main(String[] args) {
        int num1=10;
        int numm2=20;
        int sum= num1+numm2;
        System.out.println("The Sum of "+num1+" & "+numm2+" is "+sum);
        System.out.println("The sum of two numbers is "+num1+numm2);
        System.out.println(num1+numm2+" the sum of two nymbers");
        int main =2;
        int $aj=2;
        int _pj=8;
        int $ =4; //The name can be Dollar alone ($)
       // int _ = 6; // The name cannot be only underscore ( _ )
        System.out.println($aj);
        System.out.println(_pj);
        System.out.println($);
    }
}
/*
Points to remember-:
 1- What is concatination ?
    concatination is merging  two datatypes in println(Data type 1 + Data Type 2) method using + sign
    The behaviour of + sign depends on the type of datas

    example- System.out.println("Hiii My age is "+ 20);
            in this example we are concatinating  String with integer data type
            so the output will be - Hiii My age is 20
    **If we are concatinating -
    String + String = Merging
    String + Integer = Merging
    Integer + String = Merging
    Integer + Integer = Addition == If two Int were concatinated then the + will act as addition operator
    Integer + Integer + String== Example - System.out.println(10+20+" the sum of two nymbers");
        == First addition and then merging = output is "30 the sum of two numbers"
    String + Integer + Integer=Example = System.out.println(" the sum of two nymbers"+10+20);
        == Merging and merging == Output is "the sum of two numbers is 1020"

  2- Naming System of classes/methods/variables
    While naming any classes/methods/variables only two special characters are allowed
        1- _ (Underscore)
        2- $ (Dollar)
    Name cannot be start from number - Example int 1aj=4;
    The Name of classes/methods/variables  can be according to our choice
    but we cannot use the pre defined keywords to name our classes/methods/variables
    KeyWords in JAVA are -:
        abstract	continue	for 	    new 	     switch
        assert	    default 	goto	    package	    synchronized
        boolean 	do          if   	    private 	this
        break	    double  	implements 	protected	throw
        byte	    else    	import  	public  	throws
        case    	enum	    instanceof	return      transient
        catch   	extends 	int     	short   	try
        char    	final   	interface	static  	void
        class   	finally  	long    	strictfp	volatile
        const   	float   	native  	super   	while

    The Name should be written using 2 types of naming method
    1- Pascals Naming method : for classes and Interfaces
        First letter should always be capital
        Example - public class Demo{}
            D is capital
    2- Camel case method -: for Methods and Variables
        First letter should always be small and If we want another word then the first letter will be capital
        Example -   Public void start()
                    Public void startTheGame()
                    or
                    int number=10;
                    int numberIs =10;

*/