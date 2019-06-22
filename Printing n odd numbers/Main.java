      import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	     // Type your code here
      Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int temp[ ]=new int[50] ;
      int i;
      for ( i = 1; i <=n; i++) 
      {
        temp[i]= (2*i-1);  
      }
      for(i=1;i<=n;i++)
      {
        System.out.println(temp[i]);
      }
	}
}