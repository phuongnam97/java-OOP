package package7;

import java.util.Scanner;

public class EmployeeController {

    public Employee getEmpInfor() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vui long nhập tên");
        String name = sc.nextLine();
        System.out.println("Vui lòng nhập email");
        String email = sc.nextLine();
        System.out.println("Vui lòng nhập địa chỉ");
        String address = sc.nextLine();
        System.out.println("vui long nhập ngày sinh");
        long birthday = sc.nextLong();


        System.out.println("Vui lòng nhập số điện thoại");
        sc.nextLine();
        String phone = sc.nextLine();
        System.out.println("Vui lòng nhập số giờ làm việc");
        double workinghours = sc.nextDouble();
        System.out.println("Vui lòng nhập lương mỗi giờ");
        double salaryperhour = sc.nextDouble();
        System.out.println("Vui lòng nhập ngày tham gia");
        long ngaythamgia = sc.nextLong();
        System.out.println("Vui lòng nhập trạng thái");
        int status = sc.nextInt();

        Employee emp = new Employee(name, email);
        emp.setName(name);
        emp.setAddress(address);
        emp.setBirthday(birthday);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setJoineddate(ngaythamgia);
        emp.setSalaryperhour(salaryperhour);
        emp.setWorkinghours(workinghours);
        emp.setStatus(status);


        return emp;
    }

    public void printEmployeeInformation(Employee employee){

        if (employee.getStatus() == 0){
            System.out.println("Nhân viên đã nghỉ việc rồi");
            return;
        }

        System.out.println("Id: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Birthday: " + employee.getBirthday());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Working hours: " + employee.getWorkinghours());
        System.out.println("Salary per hour: " + (int)employee.getSalaryperhour()+ " USD");
        System.out.println("Joined date: " + employee.getJoineddate());
        System.out.println("Status: " + employee.getStatus());
        System.out.println("Sum salary: " + (int)employee.getWorkinghours()*(int)employee.getSalaryperhour() + " USD");

    }
}
