package package2;

public class MainThread {
    public static void main(String[] args) {
        EmployeeController emp = new EmployeeController();
        emp.printEmployeeInformation(emp.getEmpInfor());
    }
}