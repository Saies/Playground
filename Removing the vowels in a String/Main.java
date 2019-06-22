import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int len=str.length();
    StringBuilder temp=new StringBuilder("");
    int i=0;
    for(i=0;i<len;i++)
    {
      if(str.charAt(i)!='A' && str.charAt(i)!='a'&& str.charAt(i)!='E'&&str.charAt(i)!='e'&& str.charAt(i)!='I'&& str.charAt(i)!='i'&& str.charAt(i)!='O'&& str.charAt(i)!='o'&& str.charAt(i)!='U'&& str.charAt(i)!='u')     
        temp.append(str.charAt(i));     
    }
    System.out.println(temp);
  }
}
