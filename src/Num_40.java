import java.util.ArrayList;
import java.util.List;

class Department{
    private String name;
    public Department(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class University{
    private String name;
    private List<Department> departments;
    public University(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public void displayDepartments(){
        System.out.println(name);
        for (Department department : departments){
            System.out.println("    " + department.getName());
        }
    }
}

public class Num_40 {
    public static void main(String[] args){
        University university = new University("MIREA");
        Department iit = new Department("IIT");
        Department iii = new Department("III");
        university.addDepartment(iit);
        university.addDepartment(iii);
        university.displayDepartments();
    }
}
