public class deStar {
    public static void main(String[] args) {
        Stars stars = new Stars();
        int b = stars.ss();
        for (int i = b; i > 0; i--) {

            for (int a = 0; a < i; a++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
