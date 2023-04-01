import java.util.*;

class Grade {

    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total marks: ");

        double totalMarks = input.nextDouble();

        System.out.print("Enter marks obtained: ");

        double marksObtainedbystudent = input.nextDouble();

        double percentage = (marksObtainedbystudent / totalMarks) * 100;

        System.out.printf("Percentage obtained: %.2f%%\n", percentage);


        double gpa = 0.0;
        if (percentage >= 90)
           {
            System.out.println("Grade: A");
            gpa = 4.0;
        } else if (percentage >= 80) 
         {
            System.out.println("Grade: B");
            gpa = 3.0;
        } else if (percentage >= 70)
         {
            System.out.println("Grade: C");
            gpa = 2.0;
        } else if (percentage >= 60)
        {
            System.out.println("Grade: D");
            gpa = 1.0;
        } else
        {
            System.out.println("Grade: F");
        }
        System.out.println("GPA: " + gpa);

        input.close();
    }
}
