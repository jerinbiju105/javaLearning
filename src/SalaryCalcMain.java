package EncapsulationInhertance;

public class SalaryCalcMain extends Employee {

	public static void main(String[] args) {
		
		double[] salaryArray;
		salaryArray = new double[10];
		
		PermanentEmployees john = new PermanentEmployees("John", "Baby", 1001.0, 90000.0);
		PermanentEmployees bob = new PermanentEmployees("Bob", "Antony", 1002.0, 60000.0);
		PermanentEmployees sam = new PermanentEmployees("Sam", "Joe", 1003.0, 30000.0);
		PermanentEmployees roman = new PermanentEmployees("Roman", "Ro", 1004.0, 90000.0);

		ContractualEmployees matt = new ContractualEmployees("Matt", "Maher", 1005.0, 20.0);
		ContractualEmployees shane = new ContractualEmployees("Shane", "Jane", 1006.0, 50.0);
		ContractualEmployees wayne = new ContractualEmployees("Wayne", "Bruce", 1007.0, 40.0);

		CommissionBasedEmployees luci = new CommissionBasedEmployees("Luci", "Bower", 1008.0, 40000.0);
		CommissionBasedEmployees phil = new CommissionBasedEmployees("Phil", "Coulson", 1009.0, 40000.0);
		CommissionBasedEmployees steve = new CommissionBasedEmployees("Steve", "Rogers", 1010.0, 40000.0);

		// Permanent employees
		System.out.println("Payment details for permanent employees");
		

//		john.setSalary(90000.0);
		salaryArray[0] = john.calculatePay();
 		System.out.println("Bi-weekly pay for John - " + String.format("%.2f", salaryArray[0]));

//		bob.setSalary(60000.0);
 		salaryArray[1] = bob.calculatePay();
		System.out.println("Bi-weekly pay for Bob - " + String.format("%.2f", salaryArray[1]));

//		sam.setSalary(30000.0);
		salaryArray[2] = sam.calculatePay();
		System.out.println("Bi-weekly pay for Sam - " + String.format("%.2f", salaryArray[2]));

//		roman.setSalary(90000.0);
		salaryArray[3] = roman.calculatePay();
		System.out.println("Bi-weekly pay for Roman - " + String.format("%.2f", salaryArray[3]));
		System.out.println("--------");

		// Contractual employees
		System.out.println("Payment details for contractual employees");

//		matt.setSalary(20.0);
		salaryArray[4] = matt.calculatePay(80);
		System.out.println("Pay for Matt - " + String.format("%.2f", salaryArray[4]));

//		shane.setSalary(50.0);
		salaryArray[5] = shane.calculatePay(60.5);
		System.out.println("Pay for Shane - " + String.format("%.2f", salaryArray[5]));

//		wayne.setSalary(40.0);
		salaryArray[6] = wayne.calculatePay(75);
		System.out.println("Pay for Wayne - " + String.format("%.2f", salaryArray[6]));
		System.out.println("--------");

		// Commission based employees
		System.out.println("Payment details for commission based employees");

//		luci.setSalary(40000.0);
		salaryArray[7] = luci.calculatePay(20000);
		System.out.println("Commision based pay for Luci - " + String.format("%.2f", salaryArray[7]));

//		phil.setSalary(40000.0);
		salaryArray[8] = luci.calculatePay(50000);
		System.out.println("Commision based pay for Phil - " + String.format("%.2f", salaryArray[8]));

//		steve.setSalary(40000.0);
		salaryArray[9] = luci.calculatePay(10000);
		System.out.println("Commision based pay for Coulson - " + String.format("%.2f", salaryArray[9]));
		
		


	}

}
