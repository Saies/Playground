import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int a=num%10;
      int b=(num/10)%10;
    int c=num/100;
    a=a*100;
    b=b*10;
    int sum=a+b+c;
      System.out.println(sum);
  }
}