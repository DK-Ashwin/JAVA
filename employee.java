
class Employee {

    float basic;

    void calculateSalary(float basic) {
        this.basic = basic;
        float total = basic;
        System.out.println("Total Salary of Employee is " + total);
    }
}

class Manager extends Employee {

    float bonus = 10000;

    @Override
    void calculateSalary(float basic) {
        this.basic = basic;
        float total = basic + bonus;
        System.out.println("Total Salary of Manager is " + total);
    }
}

public class employee {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m1 = new Manager();
        e1.calculateSalary(25000);
        m1.calculateSalary(25000);
    }
}
