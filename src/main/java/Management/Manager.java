package Management;

public class Manager extends Employee {

    public String deptName;

    public Manager (String name, int niNumber, int salary){
        super (name, niNumber,salary);
        this.deptName = deptName;
    }



    public String getDeptName() {
        return deptName;
    }
}
