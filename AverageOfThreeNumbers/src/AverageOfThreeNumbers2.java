import java.util.Scanner;

public class AverageOfThreeNumbers2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		double number3 = scan.nextDouble();
		
		double average = (number1 + number2 + number3)/3;
		
		System.out.println("The average of" + " " + number1 + " " + number2 + " " + number3 + " " + "is" + " " + average);


	}

}
