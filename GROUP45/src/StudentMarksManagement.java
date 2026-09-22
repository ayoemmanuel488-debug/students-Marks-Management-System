import java.util.Scanner;
public class StudentMarksManagement{
	public static void main(String[]args) {
Scanner input = new Scanner(System.in);
String[] names = new String[10];
int[] marks = new int[10];
String[] grades = new String[10];
String[] results = new String[10];

int studentCount = 0;
boolean running = true;

// WHILE LOOP
while (running) {

    int choice;

    // DO-WHILE LOOP
    do {

        System.out.println("\n======================================");
        System.out.println("     STUDENT MARKS MANAGEMENT SYSTEM");
        System.out.println("======================================");
        System.out.println("1. Add Students");
        System.out.println("2. Display Student Results");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        choice = input.nextInt();

        // ADD STUDENTS
        if (choice == 1) {

            System.out.print("\nHow many students do you want to add? ");
            int number = input.nextInt();

            // FOR LOOP
            for (int i = 0; i < number; i++) {

                if (studentCount >= 10) {
                    System.out.println("Maximum of 10 students reached.");
                    break;
                }

                System.out.print("\nEnter student name: ");
                names[studentCount] = input.next();

                System.out.print("Enter marks: ");
                marks[studentCount] = input.nextInt();

                // Determine grade
                if (marks[studentCount] >= 80) {
                    grades[studentCount] = "A";
                } else if (marks[studentCount] >= 70) {
                    grades[studentCount] = "B";
                } else if (marks[studentCount] >= 60) {
                    grades[studentCount] = "C";
                } else if (marks[studentCount] >= 50) {
                    grades[studentCount] = "D";
                } else {
                    grades[studentCount] = "F";
                }

                // TERNARY STATEMENT
                results[studentCount] =
                        marks[studentCount] >= 50 ? "PASS" : "FAIL";

                studentCount++;
            }

            System.out.println("\nStudents added successfully!");

	}
        else if(choice==2) {
       if (studentCount==0) {
    	   System.out.println("\nNo student records available.");
       }else {
    	   System.out.println("\n=====STUDENT RESULTS=====");
    	   System.out.println("Name\tMarks\tGrade\tResults");
    	      for (int i = 0;i < studentCount;i++) {
    	    	  System.out.println(
    	    			  names[i]+ "\t"
    	    			  +marks[i]+ "\t"
    	    			  + grades[i]+ "\t"
    	    			  + results[i]);
    	      }
    	      // EXIT
    	       if (choice==3) {	  
    	    	  System.out.println("\n Thank you for using the system...");
    	    	  running = false;
    	       }
    	    	     // INVALID OPTION
       
    	       else {
    	    	   System.out.println("\nInvalid option.");
    	        while (choice!= 3 && running);{
       }
    	    	   input.close();
    	       }//closes main()
        }// closes class
       
  