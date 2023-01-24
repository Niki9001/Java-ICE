public class ThridPart {
    public static void main(String[] args) {
        System.out.println("Welcome to the Third Part!");
        int [] [] myArray = {{10,20,30,40}, {12,15,18,19}, {10,10,10,10}};
        System.out.println("The Array Elements are: ");
        /*for(int[] ints:myArray){
            System.out.println(Arrays.toString(ints));
        }*/
        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int R1=0;
        int R2=0;
        int R3=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==0){
                    R1=R1+myArray[i][j];
                } else if (i==1) {
                    R2=R2+myArray[i][j];
                } else if (i==2) {
                    R3=R3+myArray[i][j];
                }

            }
        }
        double Avg =(R1+R2+R3)/12;
        System.out.println("The summary of Row # 1 is:"+R1);
        System.out.println("The summary of Row # 2 is:"+R2);
        System.out.println("The summary of Row # 3 is:"+R3);
        System.out.println(" ");
        System.out.println("The average is: "+Avg);
        System.out.println("The Converted Array Elements are:");
        for (int i=0;i<3;i++)
            for (int j = 0; j < 4; j++) {
                System.out.println(myArray[i][j]);}
    }
}
