
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coffee = 2;
		double bagel = 5.25;
		double total = coffee + bagel;
		double couponDiscount = total*0.1;
		
		double finalPrice= total - couponDiscount;
		
		
		System.out.println("Price - $" +finalPrice);
		
		
		
		
	}

}
