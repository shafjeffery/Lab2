import java.util.Scanner;

public class WeightOfParcel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter weight in pounds:");
		double pounds = scan.nextDouble();
		
		double kilos = (pounds * 0.453592);
		
		System.out.println("The weight of parcel given in " + " " + pounds + " " + "pounds" + " " + "and when convert into kilos is " + kilos );
		
	}

}
