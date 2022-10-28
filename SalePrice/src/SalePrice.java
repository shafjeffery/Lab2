import java.util.Scanner;

public class SalePrice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter original price:");
		double originalPrice = scan.nextDouble();
		
		System.out.println("Enter discount percentage:");
		double discountPercentage = scan.nextDouble();
		
		double salePrice = (originalPrice - (originalPrice * discountPercentage/100));
		
		System.out.println("The sale price of an item given an" + " " + originalPrice + " " + "and a" + " " + discountPercentage + " " + "is" + " " + salePrice);
		

	}

}
