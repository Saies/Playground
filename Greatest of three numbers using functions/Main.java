import java.util.Scanner;
class Main{
  public static int great(int m,int n)
  {
    if(m>n)
    return m;
    else 
      return n; 
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int g=great(n1,n2);
      int f=great(g,n3);
      System.out.println(f);
    }
}