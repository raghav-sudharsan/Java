import java.util.Scanner; // Im importing Scanner class for user input 

public class GradeSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// Create scanner Object

        String studentName;
        int Subject1, Subject2, Subject3;
        double average; 
        char grade;

        System.out.println("Enter your name:");
        studentName = scanner.nextLine();

        System.out.println("Subject1: ");
        Subject1 = scanner.nextInt();
        
        System.out.println("Subject2: ");
        Subject2 = scanner.nextInt();

        System.out.println("Subject3: ");
        Subject3 = scanner.nextInt();
        
        average = (Subject1 + Subject2 + Subject3)/3.0;

        if(average >= 90){
            grade ='A';
        }else if( average >= 80){
            grade = 'B';
        }else if(average >= 70){
            grade = 'C';
        }else {
            grade = 'D';
        }

        System.out.println("Student Name: " + studentName);
        System.out.println("Average Grade: " + average);
        System.out.println("Grade: " + grade);
        scanner.close(); // Close the scanner object to free up resources.


    }
    
}
