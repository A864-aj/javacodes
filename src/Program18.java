import java.util.Arrays;
import java.util.Scanner;

//Array of Objects
public class Program18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Prog18_Student arr[]=new Prog18_Student[2];
        for (int i=0;i< arr.length;i++){
            String name=sc.nextLine();
            int rollNo= sc.nextInt();
            sc.nextLine();
            String colName=sc.nextLine();
            arr[i]= new Prog18_Student(name,rollNo,colName);
        }
//        System.out.println(Arrays.toString(arr));
        for (Prog18_Student t :arr){ // int x: arr
            System.out.println(t);
        }
    }
}
