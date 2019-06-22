import java.util.Scanner;
public class Main{
  public static int gcd(int m,int n)
  {int min,l=0;
    if(m>n)
      min=m;
   else
     min=n;
   while(min>=1)
   {
     if((m%min==0)&&(n%min==0))
     {
       l=min;
       break;
     }
     min--;  
   }
   return l;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int  n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
      int g=gcd(n1,n2);
      int f=gcd(g,n3);
      System.out.println(f);
	}
}