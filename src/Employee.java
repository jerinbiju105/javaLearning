package EncapsulationInhertance;

public class Employee {

	private String firstName;
	private String lastName;
	private Double sinNumber;
	private Double salary;

	public Employee() {

	}

	public Employee(String firstName, String lastName, Double sinNumber, Double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getSinNumber() {
		return sinNumber;
	}

	public void setSinNumber(Double sinNumber) {
		this.sinNumber = sinNumber;
	}

}
