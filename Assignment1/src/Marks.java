import java.util.ArrayList;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        ArrayList List = new ArrayList();
        double[] stGrades = new double[10];
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double max = 0;
        double min = 100;
        for (int i = 0; i < 10; i++) {
            //System.out.println(i+1);
            System.out.print("Enter mark # "+(i+1)+" :");
            stGrades[i] = sc.nextDouble();
            sum = sum+stGrades[i];
            List.add(stGrades[i]);
            List.toArray();
            if (stGrades[i]>max){
                max = stGrades[i];
            }
            if(stGrades[i]<min){
                min = stGrades[i];
            }
        }
        System.out.println("Final Report:");
        System.out.println("The Total Marks: "+sum);
        System.out.println("The Average: "+(sum/10));
        System.out.println("The Maximum Value: "+max);
        System.out.println("The Minimum Value:"+min);
    }
}
