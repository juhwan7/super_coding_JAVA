package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args) {
        // Male 3개 남편, 아빠, 회사원

        HusbandRole male = new Male();
        Wife wife = new Female("어이유");

        male.sayLoveEveryDay();
        male.takeCareWife(wife);

        // 이어서 아빠
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("정우성");

        maleDaddy.educateBady(baby);
        maleDaddy.sayLoveEveryDay();

        // 회사원
        EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
        EmployeeRole femaleEmployee = new MaleTow("민");

        maleEmployee.workTogether(maleEmployee);
    }


}
