import java.util.*;
class RomanNum {
    public static void romanToInt() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String s=sc.nextLine();
        int i;
        int n=0;
        s=s+" ";
        for(i=0; i<s.length()-1; i++)
         {
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch=='I' && ch2!='V' && ch2!='X')
            {n=n+1;
                System.out.println(n);
            }
            else if(ch=='I' && ch2=='V')
            {
                n=n+4;
                i+=1;
                System.out.println(n);
            }
            else if(ch=='I' && ch2=='X')
            {
                n+=9;
                i+=1;
                System.out.println(n);
            }
            else if(ch=='V')
            {n+=5;
                System.out.println(n);}
            else if(ch=='X' && ch2!='L' && ch2!='C')
            {n=n+10;
                System.out.println(n);}
            else if(ch=='X' && ch2=='L')
            {
                n=n+40;
                i+=1;
                System.out.println(n);
            }
            else if(ch=='X' && ch2=='C')
            {
                n+=90;
                i+=1;
                System.out.println(n);
            }
            else if(ch=='L')
            {
                n+=50;
                System.out.println(n);
            }
            else if(ch=='C' && ch2!='D' && ch2!='M')
            {n=n+100;
                System.out.println(n);
            }
            else if(ch=='C' && ch2=='D')
            {
                n=n+400;
                i+=1;
                System.out.println(n);
            }
            else if(ch=='C' && ch2=='M')
            {
                n+=900;
                i+=1;
                System.out.println(n);
            }
            else if(ch=='D')
            {n+=500;
                System.out.println(n);}
            else if(ch=='M')
            {n+=1000;
                System.out.println(n);}
        }
        System.out.println(n);
    }
}