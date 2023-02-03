import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        String Temp = "If it were 2°C warmer it would be: ";
        int number = scanner.nextInt();
        double celsius = (number - 32) * (5.0 / 9.0);
        System.out.println(number + "°F");
        System.out.printf("%f °C\n", celsius);
        System.out.printf("%d °C\n", (int)celsius);
        System.out.printf(Temp + "%f °C\n", (2 + celsius));
    }
}
