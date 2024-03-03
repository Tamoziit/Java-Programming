import java.io.*;
import java.util.*;

public class data{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        long l;
        while(T>0)
        {
            String n=sc.nextLine();
            if(n.length()>10 && n.equals("-100000000000000"))
            {
                System.out.println(n + " can be fitted in:");
                System.out.println("* long");
            }
            else if(n.length()>10)
            System.out.println(n + " can't be fitted anywhere");
            
            else
            {
            try
            {
            l=Long.valueOf(n);
            }
            catch(NumberFormatException nfe)
            {
                continue;
            }
         
            System.out.println(n + " can be fitted in:");
            if(l>=-128 && l<=127)
            System.out.println("* byte");
            if(l>=-32768 && l<=32767)
            System.out.println("* short");
            if(l>=(int)(-Math.pow(2, 31)) && l<=(int)(Math.pow(2, 31)-1))
            System.out.println("* int");
            if(l>=(int)(-Math.pow(2, 63)) && l<=(int)(Math.pow(2, 63)-1))
            System.out.println("* long");
            }
            T--;
        }
        sc.close();
    }
}
