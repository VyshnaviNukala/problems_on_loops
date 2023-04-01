import java.util.*;

public class Substring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        System.out.println("Enter the starting index:");
        int startindex = sc.nextInt();


        System.out.println("Enter the ending index:");
        int endindex = sc.nextInt();


        String subString = str.substring(startIndex, endIndex);


        System.out.println("The substring is: " + subString);
    }
}
