public class Test001 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6 || i == 7) {
                continue; // Skip numbers 6 and 7
            }
            System.out.println(i);
        }
    }
}
