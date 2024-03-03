import java.io.*;
import java.util.*;
public class Solution {
public static void main(String[] args) {
       Scanner sc1=new Scanner(System.in);
       //sc.nextLine();
       String s1=sc1.nextLine();
       int a=sc1.nextInt();
       Scanner sc2=new Scanner(System.in);
       String s2=sc2.nextLine();
       int b=sc2.nextInt();
       Scanner sc3=new Scanner(System.in);
       String s3=sc3.nextLine();
       int c=sc3.nextInt();
       int l=0,  i;
       String x, y, z;
       System.out.print(s1);
       l=s1.length();
       for(i=1; i<=15-l; i++)
       System.out.print(" ");
       x=Integer.toString(a);
       if(x.length()==2)
       System.out.print("0"+x);
       else if(x.length()==1)
       System.out.print("00"+x);
       else
       System.out.print(x);
       System.out.println();
       
       System.out.print(s2);
       l=s2.length();
       for(i=1; i<=15-l; i++)
       System.out.print(" ");
       y=Integer.toString(b);
       if(y.length()==2)
       System.out.print("0"+y);
       else if(y.length()==1)
       System.out.print("00"+y);
       else
       System.out.print(y);
       System.out.println();
       
       System.out.print(s3);
       l=s3.length();
       for(i=1; i<=15-l; i++)
       System.out.print(" ");
       z=Integer.toString(c);
       if(z.length()==2)
       System.out.print("0"+z);
       else if(z.length()==1)
       System.out.print("00"+z);
       else
       System.out.print(z);
       System.out.println();
       sc1.close();
       sc2.close();
       sc3.close();
    }
}
