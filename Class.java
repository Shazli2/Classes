import java.util.ArrayList;
import java.util.List;

public interface Class {
    void takeAttendance(Person person);
    List<String> getAttendanceList();
}

class Math implements Class {
    List<String> attendanceList;

    public Math() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(Person person) {
        attendanceList.add(person.getAttendanceString());
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Italian implements Class {
    List<String> attendanceList;

    public Italian() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(Person person) {
        attendanceList.add(person.getAttendanceString());
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

interface Person {
    String getAttendanceString();
}

class Student implements Person {
    private String id;
    private String name;
    private String address;

    public Student(){

    }
    public Student(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public String getAttendanceString() {
        return "this is student ("+this.name+")";
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getId() {
        return this.id;
    }
    public String getAddress(){
        return this.address;
    }
}

class Teacher implements Person {
    private String id;
    private String name;
    private String address;
    public Teacher(){}
    public Teacher(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String getAttendanceString() {
        return "this is teacher ("+this.name+")";
    }
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
}

class ClassRunner {
    public static void main(String[] args) {
        Class mathClass = new Math();
        Class italianClass = new Italian();

        Person wafi = new Student("12ss2", "Ahmed", "Kampala");
        Person jeremie = new Student("12ss3", "Ali", "Arowa");
        mathClass.takeAttendance(wafi);
        mathClass.takeAttendance(jeremie);

        Person melissa = new Teacher("123456", "Bahar", "kabowa");
        Person gulead = new Teacher("123457", "Hassan", "Byali");
        italianClass.takeAttendance(melissa);
        italianClass.takeAttendance(gulead);

        System.out.println(mathClass.getAttendanceList());
        System.out.println(italianClass.getAttendanceList());
    }
}
/* 1- Create "Class" interface which will have takeAttendance and getAttendanceList functions.
  implement that interface from 2 class which called "Math" and "Italian". write test cases.....
 */
