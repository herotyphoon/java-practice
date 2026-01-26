public class Pattern_7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(j + 1);
                } else {
                    System.out.print((char) ('A' + j));
                }
            }
            System.out.println(' ');
        }
    }
}
