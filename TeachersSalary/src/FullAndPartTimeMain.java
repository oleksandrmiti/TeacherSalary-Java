/*This program will ask a teacher for their PPS number and calculate a monthly salary.
 *
 * Programmer: Oleksandr Mitichkin
 * Date: 20.04.2023
 * */
import java.util.Scanner;
public class FullAndPartTimeMain {
	
	static Scanner sc = new Scanner (System.in); // Create a scanner
	
	public static void main(String[] args) {
		String choice = "";
		do {
			System.out.println("\n\nDo you want to enter details of a ");
			System.out.println("F: Full Time Teacher");
			System.out.println("P: Part Time Teacher");
			System.out.println("R: Principal");
			System.out.println("Q: Quit");
			System.out.print("Enter a letter of your choice: ");
			choice = sc.next();
			switch (choice.toUpperCase()) {
			case "F": {				
				FullTime fulltime = new FullTime();
				fulltime.readEmpDetails();
				fulltime.processDaysLeave();
				fulltime.getScriptsDone();
				fulltime.getPoint();
				fulltime.calculateMontlySalary();
				fulltime.calculateTax();
				fulltime.calculatePRSI();
				fulltime.calculateTakeHomePay();
				fulltime.outputTakeHomePay();
				break;
			}
			case "P": {			
				PartTime partTime = new PartTime();
				partTime.readEmpDetails();
				partTime.getHoursWorked();
				partTime.getScriptsDone();
				partTime.calculateMontlySalary();
				partTime.calculateTax();
				partTime.calculatePRSI();
				partTime.calculateTakeHomePay();
				partTime.outputTakeHomePay();
				break;
			}
			case "R": {
				Principal principal = new Principal();
				principal.readEmpDetails();
				principal.getNumberOfTeachers();
				principal.calculateMontlySalary();
				principal.calculateTax();
				principal.calculatePRSI();
				principal.calculateTakeHomePay();
				principal.outputTakeHomePay();
				break;
			}
			case "Q":
				System.out.print("\nThank you for using this program.");
				break;
			}
		} while (!choice.toUpperCase().equals(("Q")));
		
	}
}
