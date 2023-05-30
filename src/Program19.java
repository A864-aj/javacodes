//Method Overloading Concept
//Two or more methods whit same name and different parameters
public class Program19 {
    public static void main(String[] args) {
        System.out.println(sum(20,(byte)30)); //First Method + Example of "Early Binding"
        System.out.println(sum(10,10)); //Second Method
        System.out.println(sum((byte)30,40)); //Third Method + Example of "Early Binding"

    }
    public static int sum(int a,byte b){
        return a+b;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(byte b,int a){
        return a+b;
    }

}
