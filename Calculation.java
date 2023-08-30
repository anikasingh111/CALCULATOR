/**
 * Project Name: Calculator using Java principles.
 * 
 * @author anika
 *
 * Class Description: This class of my program is called Calculation which contains all the ecessary functions for the calculations
 */
public class Calculation {
	public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN; // NaN (Not-a-Number) represents an undefined result
        }
        return num1 / num2;
    }
}
