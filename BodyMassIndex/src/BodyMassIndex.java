import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter weight in kg:");
		double kilogram = scan.nextDouble();
		
		System.out.println("Enter height in m:");
		double meter = scan.nextDouble();
		
		double BodyMassIndex = (kilogram /(meter * meter));
				
		System.out.println("When the weight in kilogram is" + " " + kilogram + " " + "and the height in meter is" + " " + meter + " " + "then the individual Body Mass Index is" + " " + BodyMassIndex);
				
				

	}

}
