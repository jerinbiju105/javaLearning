
public class WeeklySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hourRate = 14;
		int hoursPerWeek = 8 * 5;
		int weeklySalary = hourRate * hoursPerWeek;

		System.out.println("Salary before deducting tax = " + weeklySalary);

		// deducting tax

		double tax = weeklySalary * 0.1;
		double takeHome = weeklySalary - tax;

		System.out.println("Total tax = " + tax);
		System.out.println("Salary after deductions = " + takeHome);

	}

}
