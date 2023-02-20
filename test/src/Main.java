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


public class Main {
    public static void main(String[] args) {
        //Course part
        Course cs = new Course();
        Course cs1 = new Course();
        String[] couses = new String[2];
        for (int i = 0; i < couses.length; i++) {
            Input it = new Input();
            String a = it.Course(i);
            couses[i]=a;
        }

        double[] test = new double[8];
        double[] test1 = new double[8];
        String[] stdnames = new String[2];
        double[] assignGrade = new double[2];
        //遍历两个课程部分
        for (int i = 0; i < couses.length; i++) {
            System.out.println("Enter students for "+couses[i]);
            Input it1 =new Input();
            Student st = new Student();
            // input student name

            for (int k = 0; k < stdnames.length; k++) {
                String b = it1.StdNames(k);
                stdnames[k]=b;
                System.out.println(stdnames[k]);
                test[0]=it1.Agrade(b,1);
                test[1]=it1.Agrade(b,2);
                if (i==0){
                    //course1 as1 and as2 total grade
                cs.Assignment1= cs.Assignment1+test[0];
                    cs.Assignment2= cs.Assignment2+test[1];}
                else if (i==1) {
                    //course2 as1 and as2 total grade
                    cs1.Assignment1= cs1.Assignment1+test[0];
                    cs1.Assignment2= cs1.Assignment2+test[1];
                }

                //test1[0]=test[0];
                //for (int l = 0; l < 2; l++) {
                   // test[l]=it1.Agrade(b,(l+1));
                  //  System.out.println(test[l]);
                  //  }




                //for (int j = 0; j < assignGrade.length; j++) {
                  //  double c = it1.Agrade(b,(j+1));
                    //assignGrade[j]=c;
                    //}
                //test[k]=assignGrade[1];

                    }

                }
        //for (int i = 0; i < assignGrade.length; i++) {
          //  System.out.println(assignGrade[i]);
        //}
        //for (int i = 0; i < test.length; i++) {
          //  System.out.println(test[i]);
        //}
        System.out.println(cs.Assignment1);
        System.out.println(cs.Assignment2);
        System.out.println(cs1.Assignment1);
        System.out.println(cs1.Assignment2);

            }




    }
