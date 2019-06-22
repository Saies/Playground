import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int sum=0;
      int n=in.nextInt();
      while(n!=0)
      {
        sum=sum+(n%10);
        n=n/10;
      }
      System.out.println(sum);
	}
}