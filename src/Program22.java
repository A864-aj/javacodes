import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program22 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt("123");
        char x=br.readLine().charAt(0);
        int c=Integer.valueOf("35");
        int d=Integer.valueOf(br.readLine());
        System.out.println(c);
        System.out.println(x);
    }
}
