import java.util.*;
public class UNO
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String u[]=new String[108];
        int i=0, x=1;
        u[i]= "R0";
        for(i=1; i<=18; i++)
        {
            u[i]="R"+x;
            if(i%2==0)
            x++;
        }
        u[19]="Y0";
        x=1;
        for(i=20; i<=37; i++)
        {
            u[i]="Y"+x;
            if(i%2!=0)
            x++;
        }
        u[38]="B0";
        x=1;
        for(i=39; i<=56; i++)
        {
            u[i]="B"+x;
            if(i%2==0)
            x++;
        }
        u[57]="G0";
        x=1;
        for(i=58; i<=75; i++)
        {
            u[i]="G"+x;
            if(i%2!=0)
            x++;
        }
        /**for(i=0; i<=75; i++)
        System.out.print(u[i]+" ");*/
        u[76]=u[77]="R2+";
        u[78]=u[79]="B2+";
        u[80]=u[81]="Y2+";
        u[82]=u[83]="G2+";
        u[84]=u[85]="RRr";
        u[86]=u[87]="BRr";
        u[88]=u[89]="YRr";
        u[90]=u[91]="GRr";
        u[92]=u[93]="RSk";
        u[94]=u[95]="BSk";
        u[96]=u[97]="YSk";
        u[98]=u[99]="GSk";
        u[100]=u[101]="CC";
        u[102]=u[103]="CC";
        u[104]=u[105]="CC4+";
        u[106]=u[107]="CC4+";
        for(i=0; i<=107; i++)
        System.out.print(u[i]+" ");
        String un[]=new String[108];
        x=0;
        for(i=0; i<=107; i++)
        un[x++]=" ";
        x=0;
        int y, f;
        int r=107-0+1;
        while(x<108)
        {
            f=0;
            y=(int)(Math.random()*r)+0;
            for(i=0; i<=107; i++)
            {
                if(un[y].equals(un[i]))
                {
                   f=1;
                   break;
                }
            }
            if(f!=1)
            {
                un[x++]=un[y];
            }
        }
        System.out.println();
        for(i=0; i<=107; i++)
        System.out.print(un[i]+" ");
   }
}
