import java.util.ArrayList;
import java.util.HashSet;

public interface Course {
    double getCourseFree();
    String getCourseStartTime();
    String getCourseEndTime();
    void printCourseDescription();
    void printEnrolledStudents();
    void enrollStudent(Student student);
    void unenrollStudent(Studnt studnt);
}
abstract class OnlineCourse implements Course{
    private double CourseFee;
    private String startTime;
    private String endTime;
    private HashSet<Student> enrollStudents;
    public OnlineCourse(double courseFee,String startTime,String endTime){
        this.CourseFee = courseFee;
        this.startTime = startTime;
        this.endTime = endTime;
        this.enrollStudents = new HashSet<Student>();
    }

    @Override
    public double getCourseFree() {
        return 0;
    }

    @Override
    public String getCourseStartTime() {
        return "";
    }

    @Override
    public String getCourseEndTime() {
        return "";
    }

    @Override
    public void enrollStudent(Student student) {

    }

    @Override
    public void unenrollStudent(Studnt studnt) {

    }
}
abstract class OnCampusCourse implements Course{
    private double courseFree;
    private String startTime;
    private String endTime;
    private HashSet<Student>enrolledSrudents;

    public OnCampusCourse(double courseFree,String startTime,String endTime){
        this.courseFree = courseFree;
        this.startTime = startTime;
        this.endTime = endTime;
        this.enrolledSrudents = new HashSet<Student>();
    }

    @Override
    public double getCourseFree() {
        return courseFree;
    }

    @Override
    public String getCourseStartTime() {
        return startTime;
    }

    @Override
    public String getCourseEndTime() {
        return endTime;
    }

    @Override
    public void enrollStudent(Student student) {
        enrolledSrudents.add(student);
    }

    @Override
    public void unenrollStudent(Studnt studnt) {
        enrolledSrudents.remove(studnt);
    }
}
public class Student{
    private String name;
    private int age;
    private String studentId;
    public Student(String name,int age,String studentId){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
public class ProgrammingCourse extends OnlineCourse{
    public programmingCourse(){
        super();
    }

    @Override
    public void printCourseDescription() {
        System.out.println("Programming Course");
    }

    @Override
    public void printEnrolledStudents() {
        System.out.println("Enrolled Students");
    }
}
public class MathematicsCourse extends OnlineCourse{

    public MathematicsCourse(){
        super();
    }

    @Override
    public void printCourseDescription() {
        System.out.println("Mathematics Course");
    }

    @Override
    public void printEnrolledStudents() {
        System.out.println("Enrolled Students");
    }
}
public class Main{
    public static void main(String[] args) {
        ArrayList<Student>students = new ArrayList<>();
        for (int i = 1;i<=10;i++){
            students.add(new Student("Student"+i,20+i,"Id"+i));
        }
        ProgrammingCourse programmingCourse = new ProgrammingCourse();
        MathematicsCourse mathematicsCourse = new MathematicsCourse();
    }
}

/* Define a Course interface with the following methods:
 double getCourseFee()
 String getCourseStartTime()
 String getCourseEndTime()
 void printCourseDescription()
 void printEnrolledStudents()
 void enrollStudent(Student student)
 void unenrollStudent(Student student)
OnlineCourse and OnCampusCourse:
Create two abstract classes, OnlineCourse and OnCampusCourse, that implement the Course interface.
  These classes should:
 Implement the necessary methods from the Course interface.
 Store basic course-related information such as course fee, timings, and type (online or on-campus).
 Maintain a unique list of enrolled students using a HashSet<Student>.
Student Class:
Define a Student class to store basic student information such as name, age, and student ID.
Course Implementations:
 Create two concrete classes:
 ProgrammingCourse, which extends OnlineCourse.
 MathematicsCourse, which extends OnCampusCourse.
 Each class should define specific course-related fields and implement any abstract methods.
Main Program:
In the main program, create 10 instances of the Student class and assign some of them to either
 the ProgrammingCourse or  MathematicsCourse then test your interface functions one by one
at the end upload your codes to github.

 */
