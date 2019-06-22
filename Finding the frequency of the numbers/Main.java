import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int arr1[]=new int[n];
    int i=0;
    for(i=0;i<n;i++)
      arr1[i]=in.nextInt();
    int z=1;
    int arr2[]=new int[k];
    for(i=0;i<k;i++)
    {
      arr2[i]=z++;
    }
    int temp[]=new int[k];
    for(i=0;i<n;i++)
    {
      for(int j=0;j<k;j++)
      {
        if(arr1[i]==arr2[j])
          temp[j]++;
      }
    }
    for(i=0;i<k;i++)
    {
      System.out.println(arr2[i]+" "+temp[i]);
    }
  }
}