import java.util.Objects;

public class Manager extends Person {
    private int managerid;
    private int actionNumber;
    public Manager(String name, int age, String username, String password){
        super(name,age,username,password);
        this.managerid = (int) (10000000*Math.random());
        this.actionNumber = 0;
    }

    public int getManagerid() {
        return managerid;
    }
    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }
    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerid=" + managerid +
                ", actionNumber=" + actionNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return managerid == manager.managerid && actionNumber == manager.actionNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), managerid, actionNumber);
    }
}
/* Create Manager class, it should extend Person, it should have extra managerId
(auto generate) and actionNumber( set zero when you created the object so it should assign 0 in the constructor)
Required extra functions: getActionNumber, setActionNumber and getManagerID
Overide toString again and print extra managerID
override equals function and check if username and password matchs
or managerIDand password match.  IF any of cases are correct we will return true.
 */