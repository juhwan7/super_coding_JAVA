package exercise.chapter_37;

public class Male extends FamilyMan implements FamilyRole, EmployeeRole {
    private int age;
    private String job;


    @Override
    public void workTogether(EmployeeRole employeeRole) {

    }

    @Override
    public String getName() {
        return this.name;
    }


}
