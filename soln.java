import java.io.*;
import java.util.*;

public class soln
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String ar[]=new String[N];
        int i=0;
        for(i=0; i<N; i++)
        ar[i]=sc.nextLine();
        int j, k, sum;
        for(i=0; i<N; i++)
        {
            int m[]=new int[3];
            int x=0;
            int z=0;
            String w="";
            String s=ar[i];
            s=s+" ";
            for(j=0; j<s.length(); j++)
            {
                char ch=s.charAt(j);
                if(ch!=' ')
                {
                    w=w+ch;
                    //System.out.println(w);
                }
                else if(ch==' ')
                {
                    z=Integer.valueOf(w);
                    m[x++]=z;
                    w="";
                }
            }
            sum=m[0];
            for(k=0; k<m[2]; k++)
            {sum=sum+(int)(Math.pow(2,k)*m[1]);
             System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
