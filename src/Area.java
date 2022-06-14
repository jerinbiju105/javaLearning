package MethodsAndClasses;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instatiating object

		Rectangle rec = new Rectangle();
		Rectangle rec2 = new Rectangle();

		// rec

		rec.length = 2;
		rec.bredth = 3;

		double areaofrec = rec.area();
		System.out.println("Area of rec - " + areaofrec);

		// rec2

		rec2.length = 25;
		rec2.bredth = 30;

		double areaofrec2 = rec2.area();
		System.out.println("Area of rec2 - " + areaofrec2);

	}

}
