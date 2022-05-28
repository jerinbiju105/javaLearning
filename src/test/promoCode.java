package test;

import java.util.Scanner;

public class promoCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double priceOfItem = 50;
		double finalPrice = 0;

		String promoApplied = "";
		
		System.out.println("enter promo applied");
		
		Scanner sc = new Scanner(System.in);
		
		promoApplied = sc.next();

		if (promoApplied == "Promo5") {
			// 50% discounted amount minus 5% of the total discount
			finalPrice = (priceOfItem - (priceOfItem * 0.5)) - ((priceOfItem - (priceOfItem * 0.5)) * 0.05); 

			System.out.print(finalPrice);
		}

		else if (promoApplied == "Promo10") {
			// 50% discounted amount minus 5% of the total discount
			finalPrice = (priceOfItem - (priceOfItem * 0.5)) - ((priceOfItem - (priceOfItem * 0.5)) * 0.1);

			System.out.print(finalPrice);
		}

		else if (promoApplied == "Promo20") {
			// 50% discounted amount minus 5% of the total discount
			finalPrice = (priceOfItem - (priceOfItem * 0.5)) - ((priceOfItem - (priceOfItem * 0.5)) * 0.2);

			System.out.print(finalPrice);
		} else {
			// 50% discounted amount 
			finalPrice = (priceOfItem - (priceOfItem * 0.5));
			System.out.print(finalPrice);
		}
	}

}
