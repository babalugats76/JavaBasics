import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperatureConverter {

    public static void main(String[] args) {

        // Define instance of Scanner which is used to get user input
        Scanner scanner = new Scanner(System.in);

        // Output welcome message
        System.out.println("Welcome to the Temperature Converter!");

        // Prompt user for input (temperature - in Fahrenheit - to convert to Celcius)
        System.out.print("Please enter the temperature (in Fahrenheit) to be converted to Celsius: ");

        // Value retrieved from user
        double tempToConvert = scanner.nextDouble();

        // Converted value
        double tempConverted = fahrenheitToCelsius(tempToConvert);

        // Create an object instance of DecimalFormat (used to format data)
        DecimalFormat df = new DecimalFormat("####.#");

        // Format the converted temperature (returns a String)
        String tempFormatted = df.format(tempConverted);

        // Show user the result 
        System.out.println(tempToConvert + " degrees in Fahrenheit is " + tempFormatted + " degrees in Celsius");
    }

    /**
     * Converts fahrenheit temperatures to celsius
     *
     * @param fahrenheit temperature
     * @return celsius equivalent
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

}
