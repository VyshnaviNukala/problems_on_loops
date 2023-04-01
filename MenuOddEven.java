import java.util.*;
class MenuOddEven{
  public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
char flag='y';
while(flag=='y'){
  System.out.println("Menu based app - Even/Odd Checker");
   System.out.println("Please enter the number:");
  
  int N=sc.nextInt();
  if(N%2==0)
  {
   System.out.println("The given number - "+N+"is an EVEN number");
   }
  else 
   System.out.println("The given number - "+N+"is an ODD number");
 
 System.out.println("Do you want to continue:");
  flag=sc.next().charAt(0);
 
   }
}
}
   