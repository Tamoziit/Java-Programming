import java.util.*;
public class RandomGC
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight");
        int W=sc.nextInt();
        int h=0;
        h=W/2;
        if(h*2==W)
        System.out.println("Equal Divs");
        else
        System.out.println("Non-Equal Divs");
    }
}
        
