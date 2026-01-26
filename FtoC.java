import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        float f = s.nextFloat();
        float c = (f - 32) * ((float) 5 /9);
        System.out.println("Temperature in Celsius is: " + c);
    }
}
