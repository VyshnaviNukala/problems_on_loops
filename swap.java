import java.util.*;
class Swap{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter numA value");
     int numA=sc.nextInt();
      System.out.println("enter numB value");
      int numB=sc.nextInt();
     int sv;
     System.out.println("Before swapping"+"  "+numA +"  "+numB);
      sv=numA;
      numA=numB;
      numB=sv;
     System.out.println("After swapping"+"   "+numA +"  "+numB);

   }
}
     