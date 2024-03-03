import java.util.*;
public class palindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        char a[]=new char[s.length()];
        int i, x=0;
        for(i=0; i<s.length(); i++)
        {
            a[x++]=s.charAt(i);
        }
        for(i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        char b[]=new char[a.length];
        for(i=0; i<a.length; i++)
        {
            b[i]=a[a.length-1-i];
            b[a.length-1-i]=a[i];
        }
        for(i=0; i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}