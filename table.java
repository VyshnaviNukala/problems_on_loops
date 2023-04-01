import java.util.*;
class Table{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter N value");
     int N=sc.nextInt();
      int num=5;
     for(int i=1;i<=N;i++)
       {
        System.out.println(num+"x"+i+"="+num*i);
        }

     }
}