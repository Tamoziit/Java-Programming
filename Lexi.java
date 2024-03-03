import java.io.*;
import java.util.*;

public class Lexi {

    public static void main() {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String a[]=new String[s.length()];
       int y=sc.nextInt();
       int i, j;
       String w="";
       int x=0;
       for(i=0; i<=s.length()-y; i++)
       {
           w=s.substring(i,i+y);
           a[x++]=w;
           w="";
       }
       x=0;
       for(i=0; i<a.length; i++)
       {
           if(a[i]!=null)
           x++;
       }
       String f[]=new String[x];
       int c=0;
       for(i=0; i<x; i++)
       {
           if(a[i]!=null)
           f[c++]=a[i];
       }
       String t="";
       for(i=0; i<f.length-1; i++)
       {
           for(j=0; j<f.length-1-i; j++)
           {
               if(f[j].compareTo(f[j+1])>0)
               t=f[j];
               f[j]=f[j+1];
               f[j+1]=t;
           }
       }
       System.out.println(f[0]);
       System.out.println(f[f.length-1]);
       
    }
}
