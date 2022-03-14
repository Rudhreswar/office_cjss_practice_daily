package com.tasks.task2.test;

import com.tasks.task2.data.Employee;
import com.tasks.task2.util.EmployeeService;

import java.util.ArrayList;

import java.util.List;

public class TestClass {
    public static void main(String[] args) {

        // Setting values for Employee..............................................

        Employee employeeWithOutBenefits = new Employee();
        employeeWithOutBenefits.setEmployeeName("Rishi");
        employeeWithOutBenefits.setEmployeeId("IdRishi1");
        employeeWithOutBenefits.setSalary(2343435.0);
        employeeWithOutBenefits.setDeptId(4);
        employeeWithOutBenefits.setLocationId(3);

        // First  Employee Details..............................................
        Employee employee1 = new Employee();
        employee1.setEmployeeId("empId1");
        employee1.setEmployeeName("First Employee");

        List<Long> benifitIdlistForEmployee1 = new ArrayList<>();
        benifitIdlistForEmployee1.add(3l);
        benifitIdlistForEmployee1.add(4l);

        employee1.setBenefitId(benifitIdlistForEmployee1);
        employee1.setDeptId(1);
        employee1.setLocationId(1);
        employee1.setSalary(150.0);

        //  System.out.println(employee1);
// Second Employee Details.........................................................

        Employee employee2 = new Employee();
        employee2.setEmployeeId("empId2");
        employee2.setEmployeeName("Second Employee");

        List<Long> benifitIdlistForEmployee2 = new ArrayList<>();
        benifitIdlistForEmployee2.add(1l);
        benifitIdlistForEmployee2.add(2l);
        benifitIdlistForEmployee2.add(3l);

        employee2.setBenefitId(benifitIdlistForEmployee2);
        employee2.setDeptId(2);
        employee2.setLocationId(2);
        employee2.setSalary(200000000.0);

        Employee employee3 = new Employee();
        employee3.setEmployeeId("empId2");
        employee3.setEmployeeName("Second Employee");

        List<Long> benifitIdlistForEmployee3 = new ArrayList<>();
        benifitIdlistForEmployee3.add(1l);


        employee3.setBenefitId(benifitIdlistForEmployee2);
        employee3.setDeptId(3);
        employee3.setLocationId(3);
        employee3.setSalary(300000.0);

        //ADDING EMPLOYEES OBJECTS INTO EMPLOYEES LIST...................................................

        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(employee1);
        employeesList.add(employee2);
        employeesList.add(employee3);
        employeesList.add(employeeWithOutBenefits);


        // NOTE : Employee Service Class Object is used for Calling the EmployeeService class Methods.....

        EmployeeService employeeService = new EmployeeService();

        System.out.println("2.a) Retrieve all employees in India ===== ");

        System.out.println(employeeService.employeesInIndia(employeesList));
        System.out.println("\n 2.b) Retrieve employees who are in Chennai or Hyderabad  : ");
        System.out.println(employeeService.retriveEmployeeWhoareInChennaiOrHyd(employeesList));

        System.out.println("\n 2.c) Retrieve employees who have Benefits and display benefits details : ");

        System.out.println(employeeService.retriveEmployeeWhoHaveBenifits(employeesList));

        System.out.println("\n 2.d) Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry");
        System.out.println(employeeService.retriveEmployeeDetails(employeesList));


        System.out.println("   2.e) Retrieve employees who are in Chennai and India  ............");
        System.out.println(employeeService.retriveEmployeeWhoareInChennaiOrIndia(employeesList));




    }
}
