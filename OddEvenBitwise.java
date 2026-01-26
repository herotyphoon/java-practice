import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = s.nextInt();

        if ((num & 2) == 2) {
            System.out.println("Even");
        } else if (num == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
