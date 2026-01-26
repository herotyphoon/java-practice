public class Pattern_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            char c1 = 'A';
            char c2 = 'a';
            for (int j = 0; j < 4; j++) {
                char ch;
                if (i % 2 == 0) {
                    ch = (char) (c2 + i);
                } else {
                    ch = (char) (c1 + i);
                }
                System.out.print(ch);
            }
            System.out.println(' ');
        }
    }
}
