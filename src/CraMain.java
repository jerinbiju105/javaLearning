package Classwork;

public class CraMain {

	public static void main(String[] args) {
		
		

		Employee employee = new Employee(89795);
		Cra cra = new Cra (true);
		
		System.out.println("Sin num :"+employee.getSinNumber());
		
		employee.setSinNumber(23456, cra,6666);

		System.out.println("Sin num :"+employee.getSinNumber());
		
		employee.setSinNumber(342432,cra,1234);
		
		System.out.println("Sin num :"+employee.getSinNumber());
		
		//only CRA can change the SIN Number
		
		employee.setSinNumber(23456, cra,1234);

		System.out.println("Sin num :"+employee.getSinNumber());

	}

}
