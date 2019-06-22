import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      //to find last digit
      int b=n%10;
      //to find first digit
      while(n>=10)
      {
        n=n/10;
      }
      int a=n;
      int sum=a+b;
      System.out.println(sum);
      
	}
}