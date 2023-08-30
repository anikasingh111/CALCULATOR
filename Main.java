import java.util.Scanner;

/**
 * Project Name: Calculator using Java principles.
 * 
 * @author anika
 *
 * Class Description: This class of my program contains the main method.
 * It uses an efficient switch case to create different cases of operator
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculation calculator = new Calculation();
		double num1, num2, result;
		char operator;

		while (true) {
			System.out.print("Enter first number: ");
			num1 = input.nextDouble();

			System.out.print("If you want to exit, enter G/g otherwise Enter an operator + , - , * , / ");
			operator = input.next().charAt(0);

			if (Character.toLowerCase(operator) == 'g') {
				break; // Exit the loop if 'g' is entered (ignoring case)
			}
			System.out.print("Enter second number: ");
			num2 = input.nextDouble();

			switch (operator) {
			case '+':
				result = calculator.add(num1, num2);
				break;
			case '-':
				result = calculator.subtract(num1, num2);
				break;
			case '*':
				result = calculator.multiply(num1, num2);
				break;
			case '/':
				result = calculator.divide(num1, num2);
				break;
			default:
				System.out.println("Invalid operator");
				continue; // Continue to the next iteration
			}

			System.out.println("Result: " + result);
		}

		input.close();
	}
}
