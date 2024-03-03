import java.io.*;
import java.util.*;

public class Duplicate {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >= 0)
        {
            String s=sc.nextLine();
            int x=0;
            int i, j;
            s=s+" ";
            String w="";
            String a[] = new String[s.length()];
            for(i=0; i<s.length(); i++)
            {
                char ch = s.charAt(i);
                if(ch!=' ')
                w=w+ch;
                else
                {
                    a[x++]=w;
                    w="";
                }
            }
            String k="";
            int c;
            for(i=0; i<x; i++)
            {
                k=a[i];
                c=0;
                for(j=i; j<x; j++)
                {
                    if(a[j].equalsIgnoreCase(k))
                    c++;
                }
                if(c==1)
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}