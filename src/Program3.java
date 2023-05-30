//IN THIS PROGRAM WE LEARNED ABOUT DATA TYPES
public class Program3 {
    public static void main(String[] args) {
        //INTEGER TYPE
        byte b= 1; // Max range is -128 to 127
        short s=7263;//max range is -32768 to 32767
        int i=212121212; //max range is  to -214748364848 to 214748364847
        long  l=9223372036854L; //it is by defalut int type but we have to add "L" in last to take it as (Long)
                                //long max range is -9223372036854775808 to 9223372036854775807

        //Floating Points
        float f=21.3F; //it is by defalut double type but we have to add "F" in last to take it as (float)
        double d=32.3; //For double it's optional to use D or d
        double d2=33.33D;//used D literal

        //Non Numeric
        boolean bo=false;
        char c='@';
        char c2=23323; //prints a chinese letter "嬛"

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(bo);
        System.out.println(c);
        System.out.println(c2);


    }
}
/*
Points to Remember-:
    1-: DATA TYPES IN JAVA---
        Data Types are divided into two categories--
            1) Primitive Data Types
            2) Non-Primitive Data Types

    #Primitive Data Types--
        There are Three types of primitive data types
        1)Integer Type--
            byte
            short
            int(by default)
            long
        **point to remember--
            Every Integer constant in java is int by default--
            Example - every whole no. is by default set to int type in java . you can see the above program

         2)Floating point-- (112.33 , 54.7.....etc)point wale numbers
            float
            double (by default)
            by default every floating point number will be taken as of double type ,
            so if we want it in float type we have to write "F" after the number
            ----Refer above program for example

         3)Non-Numeric--
            boolean -- True or False
            char   -- !@#$%^^&*()_~ or -- ASCII values(ranges from 0-65535)
                   --every character has different ASCII value ...for example -: 65 is ASCII value of 'A' and 97 is of 'a'
                    -- char can hold an equivalent int values


Points to Remember-:
    **Size of Each Primitive DATA TYPE--
        byte	1 byte
        short	2 bytes
        int	    4 bytes
        long	8 bytes
        float	4 bytes
        double	8 bytes
        boolean	1 bit
        char	2 bytes


 */