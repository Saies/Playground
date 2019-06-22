import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String[] word=str.split(" ");
    int i=0;
    for(i=0;i<word.length;i++)
    {
      if(word[i]!=null)
      {
        for(int j=i+1;j<word.length;j++)
        {
          if(word[i].equals(word[j]))
          {
            word[j]=null;
          }
        }
      }
    }
    for(i=0;i<word.length;i++)
    {
      if(word[i]!=null)
       System.out.print(word[i]+" ");
    }
  }
}