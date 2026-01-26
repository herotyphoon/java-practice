public class Pattern_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            char c = 'A';
            for (int j = 0; j < 4; j++) {
                char ch = (char) (c + j);
                System.out.print(ch);
            }
            System.out.println(' ');
        }
    }
}
