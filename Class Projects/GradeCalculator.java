import java.util.InputMismatchException;
import java.util.Scanner; 
public class GradeCalculator {
    public static void main(String[] args){
        int grade = 0; 

        Scanner gradeValue = new Scanner(System.in);
        /*System.out.println("Please enter your grade as an interger.");
        grade = gradeValue.nextInt();*/

        do{
            try{
                System.out.println("Please enter your grade as an interger.");
                grade = gradeValue.nextInt();
            } catch (InputMismatchException e){
                System.out.println("This input is not valid. Please try again.");
                grade = gradeValue.nextInt();
            }

        }while (!(grade >= 0));

        while (grade < 0){
            System.out.println("please enter a value greater than -1");
            grade = gradeValue.nextInt();
        }
        

        if (grade >= 0 && grade < 60) {
            System.out.println("Your grade is F");
        } else if (grade <= 60 && grade < 67) {
            System.out.println("Your grade is D+");
        } else if (grade >= 67 && grade < 69) {
            System.out.println("Your grade is D");
        } else if (grade >= 69 && grade < 72 ) {
            System.out.println("Your grade is C-");
        } else if (grade >= 72 && grade < 77) {
            System.out.println("Your grade is C");
        } else if (grade >= 77 && grade < 79) {
            System.out.println("Your grade is C+");
        } else if (grade >= 79 && grade < 82) {
            System.out.println("Your grade is B-");
        } else if (grade >= 82 && grade < 87) {
            System.out.println("Your grade is B");
        } else if (grade >= 87 && grade < 89) {
            System.out.println("Your grade is B+");
        } else if (grade >= 89 && grade < 92) {
            System.out.println("Your grade is A-");
        } else if (grade >= 92) {
            System.out.println("Your grade is A");
        }
    }
}