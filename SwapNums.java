import java.util.Scanner;

public class SwapNums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();

        System.out.println("a is " + a + "\nb is " + b);

        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Now\na is " + a + "\nb is " + b);
    }
}
