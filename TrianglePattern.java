import java.util.*;

public class TrianglePattern {

    public static void main(String[] args) {

        int rowsNo = 4; 

        int i, j; 
        
        
        for (i = 1; i <= rowsNo; i++) {
            
            for (j = 1; j <= 2*i-1; j++) {

                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        
        for (i = rows-1; i >= 1; i--) {
            
            for (j = 1; j <= 2*i-1; j++) {

                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}