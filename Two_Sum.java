import java.util.Scanner;
class Two_Sum
{ 
int[] indices (int a[], int l, int n) 
{
int i,j,c=0;
int[] ar= new int[2];
for(i=0;i<=l;i++) 
{
c=a[i];
for(j=i;j<=l;j++) 
if ((c+a[j])==n) 
{ar[0]=i;
 ar[1]=j;}
return ar;
}
}
public static void main(String args[]) 
{
Scanner sc= new Scanner(System.in);
int i;
System.out.println("Enter target variable:");
int t=sc.nextInt();
System.out.println("Enter input array size:");
int len=sc.nextInt();
System.out.println("Enter input array:");
int ak[]= new int[len];
for(i=0;i<=len-1;i++) 
ak[i]=sc.nextInt() ;
Two_Sum ts= new Two_Sum();
int[] ap = new int[2];
for(i=0;i<=2;i++)
ap[i]= ts.indices(ak[], len-1, t);
if(ap[0]==ap[1]) 
{
System. out. println("Wrong input array");
System.exit(0) ;
}
else 
{
System.out.println("Output Array:");
for(i=0;i<=2;i++) 
System. out. println(ap[i]+",");
}
}
}