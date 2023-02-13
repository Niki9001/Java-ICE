public class Student {
    public String studentName;
    public double assignmentOne;
    public double assignmentTwo;
    public Student(String studentName, double assignmentOne, double assignmentTwo){
        this.studentName=studentName;
        this.assignmentOne=assignmentOne;
        this.assignmentTwo=assignmentTwo;
    }
    public double studentAverage(){return (this.assignmentOne+this.assignmentTwo)/2;}
    public String stReport(){return this.studentName + ": Assignment1 - " + this.assignmentOne + " Assignment2 - " + this.assignmentTwo+" Total -"+(this.assignmentOne+this.assignmentTwo);}
}
