package package1;

import java.util.Scanner;

public class EmployeeController {

    public Employee getEmpInfor(){

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Vui lòng nhập tên nhân viên");
        String name = sc1.nextLine();
        System.out.println("Vui lòng nhập email");
        String email = sc1.nextLine();
        System.out.println("Vui lòng nhập địa chỉ");
        String diachi = sc1.nextLine();
        System.out.println("Vui lòng nhập ngày sinh");
        long ngaysinh = sc1.nextLong();


        System.out.println("Vui lòng nhập số điện thoại");
        sc1.nextLine();
        String dienthoai = sc1.nextLine();
        System.out.println("Vui lòng nhập số giờ làm việc");
        double giolamviec = sc1.nextDouble();
        System.out.println("Vui lòng nhập lương mỗi giờ");
        double luongmoigio = sc1.nextDouble();
        System.out.println("Vui lòng nhập ngày tham gia");
        long ngaythamgia = sc1.nextLong();
        System.out.println("Vui lòng nhập trạng thái");
        int trangthai = sc1.nextInt();



        Employee emp = new Employee(name,email);
        emp.setName(name);
        emp.setAddress(diachi);
        emp.setBirthday(ngaysinh);
        emp.setEmail(email);
        emp.setPhone(dienthoai);
        emp.setJoineddate(ngaythamgia);
        emp.setSalaryperhour(luongmoigio);
        emp.setWorkinghours(giolamviec);
        emp.setStatus(trangthai);
        return emp;
    }

    public void printEmployeeInformation(Employee employee){

        if (employee.getStatus() == 0){
            System.out.println("Nhân viên đã nghỉ việc");
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
