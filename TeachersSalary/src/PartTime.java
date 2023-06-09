// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

/************************************************************/
/**
 * 
 */
public class PartTime extends Employee {
	/**
	 * 
	 */
	private byte hoursWorked;
	private boolean validHoursWorked;
	/**
	 * 
	 */
	public void getHoursWorked() {
		do {
            try {
                do {
                    System.out.print("\nEnter how many hours you have done:");
                    hoursWorked = FullAndPartTimeMain.sc.nextByte();
                    if (hoursWorked < 0) {
                        System.err.println("Sorry, something wrong, try again."); 
                    }
                } while (hoursWorked < 0);
                 validHoursWorked = true; // Stopping asking.
            }
            catch(java.util.InputMismatchException e){
                System.err.println("Please use numbers."); // In case if user entered a letters
                FullAndPartTimeMain.sc.next(); //Call scanner again
            }
        } while (!validHoursWorked);
	}
	public void getScriptsDone() {
		do {
            try {
                do {
                    System.out.print("\nEnter how many scripts you have done:");
                    scriptsDone = FullAndPartTimeMain.sc.nextByte();
                    if (scriptsDone < 0) {
                        System.err.println("Sorry, something wrong, try again."); 
                    }
                } while (scriptsDone < 0);
                 validScriptsDone = true; // Stopping asking.
            }
            catch(java.util.InputMismatchException e){
                System.err.println("Please use numbers."); // In case if user entered a letters
                FullAndPartTimeMain.sc.next(); //Call scanner again
            }
        } while (!validScriptsDone);
	}
	/**
	 * 
	 */
	public void calculateMontlySalary() {
		additionalPayment = scriptsDone*10.18f;
		monthlySalary = hoursWorked*34.03f + additionalPayment;
	}
	/**
	 * 
	 */
	public void calculateTax() {
		if (monthlySalary*12 < 40000) {
			tax = monthlySalary*22/100;
		} else {
			tax = (((40000f/12)*22/100)+((monthlySalary-(40000f/12))*42/100));
		}
	}
	/**
	 * 
	 */
}
