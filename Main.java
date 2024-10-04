

/*Create abstract Person Class and inherit that by Man class then inherit that Man by WorkerMan.
Inherit Person by Woman then inherit Women by WomanWorker.
Create main function, in the main function create 6-7-8
 people(each of them will be type of Man or WorkerMan or Woman or WorkerWoman)
 */******************************************
abstract class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract String role();
}
class Man extends Person{
    public Man(String name){
        super(name);
    }

    @Override
    public String role() {
        return "Man";
    }
}
class WorkerMan extends Man{
    public WorkerMan(String name){
        super(name);
    }

    @Override
    public String role() {
        return super.role();
    }
}
class Woman extends Person{
    public Woman(String name){
        super(name);
    }

    @Override
    public String role() {
        return "Woman";
    }
}
class WomanWorker extends Woman{
    public WomanWorker(String name){
        super(name);
    }

    @Override
    public String role() {
        return super.role();
    }
}
public class Main{
    public static void main(String[] args) {
        Person[]people = new Person[]{
                new Man("Ali"),
                new WomanWorker("Fatima"),
                new Woman("Sali"),
                new Man("Rani"),
                new WorkerMan("Salih"),
        };
        for (Person person:people){
            System.out.println(person.getName()+" is a "+person.role()+".");
        }
    }
}