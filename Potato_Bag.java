import java.util.*;
public class Potato_Bag
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight");
        int W=sc.nextInt();
        int i, c=0;
        int n=W;
        for(i=2; i<=Math.sqrt(n); n+=2)
        {
            while(n%i==0)
            {
                if(i==2)
                c++;
                n=n/i;
            }
        }
        if(W==2)
        System.out.println("NO");
        else if(c>1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
