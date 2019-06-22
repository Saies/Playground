import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      int i=0,j=0,sum=0,temp=0;
      for(i=0;i<arr_size;i++)
      {
        arr[i]=in.nextInt();
      }
      int value=in.nextInt();
      for(i=0;i<arr_size;i++)
      { temp=arr[i];
       for(j=i+1;j<arr_size;j++)
       {  
          sum=temp+arr[j];
         if(sum==value)
           System.out.println(temp+", "+arr[j]);
      }
    }
}
}