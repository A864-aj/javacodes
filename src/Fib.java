class Fib{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=100;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2; //0+1=1 //1+1=2//1+2=3//2+3=5//3+5=8
            System.out.print(" "+n3); //1//2//3//5//8
            n1=n2; // 0=1 , 1=1//1=1 ,1=2//1=2 ,2=3//2=3 ,3=5//
            n2=n3;
        }

    }}
