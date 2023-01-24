public class inStar {
    public static void main(String[] args){
        Stars stars = new Stars();
        int a = stars.ss();
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
