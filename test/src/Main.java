import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] javaGroup = new Student[2]; //TODO changed
        Student [] pythonGroup = new Student[2];
        //String firstCName=sc.nextLine();// TODO Add
        //sc.nextLine();
        System.out.println("Programming IT Courses");
        System.out.println("COURSE ENTRY");
        System.out.println("==============================");
        Course[] courseGrop = new Course[2];
        String courseName1;
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name for course #"+(i+1));
            courseName1=sc.nextLine();
            courseGrop[i] =new Course(courseName1);
        }

        /*System.out.println("1st course name");
        String courseName;
        courseName = sc.nextLine();
        Course javaCourse =new Course(courseName);//TODO changed
        Student[] pythonGroup = new Student[2];//TODO changed
        //String secondCName=sc.nextLine();// TODO Add
        //sc.nextLine();
        System.out.println("2nd course name");
        courseName = sc.nextLine();
        Course pythonCourse = new Course(courseName);//TODO changed*/
        System.out.println("Student entry");
        System.out.println("==============================");
        System.out.println("Enter students for"+courseGrop[1]);
        for (int i = 0; i < javaGroup.length; i++) {
            System.out.println("Enter name for student # "+(i+1)+" : ");
            String stName = sc.nextLine();
            System.out.print("Enter Assignment1 mark for: "+stName+":");

            double assignment1 = sc.nextDouble();
            System.out.print("Enter Assignment1 mark for: "+stName+":");
            double assignment2 = sc.nextDouble();
            sc.nextLine();

            javaGroup[i]=new Student(stName,assignment1,assignment2);
            pythonGroup[i] = new Student(stName,assignment1,assignment2);
        }
        for (int i = 0; i < courseGrop.length; i++) {
            courseGrop[i].assignment1=courseGrop[i].assignment1+javaGroup[i].assignmentOne;
            courseGrop[i].assignment2=courseGrop[i].assignment2+javaGroup[i].assignmentTwo;
        }
        for (int i = 0; i < courseGrop.length; i++) {
            System.out.println(javaGroup[i].stReport());
        }
        for (int i = 0; i < courseGrop.length; i++) {
            System.out.println(courseGrop[i].courseReport());
        }

    }
}