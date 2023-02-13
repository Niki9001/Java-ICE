public class Course {
    public String courseName;
    public double assignment1=0;
    public double assignment2=0;
    public double average;
    public Course(String courseName){this.courseName=courseName;}
    public double average(){return (this.assignment1+this.assignment2)/2;}
    public String courseReport(){
        return this.courseName + " Programming : Assignment1 - " +this.assignment1 + "   Assignment2 - " + this.assignment2 +
                " Average - " + this.average();
    }

}
