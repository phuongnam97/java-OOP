package package1;

import java.util.Scanner;

public class MainThread {


    public static void main(String[] args) {


        EmployeeController emController = new EmployeeController();
        emController.printEmployeeInformation(emController.getEmpInfor());

    }
}
