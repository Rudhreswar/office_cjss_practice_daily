package com.tasks.task2.util;

import com.tasks.task2.data.Benefits;
import com.tasks.task2.data.Department;
import com.tasks.task2.data.Employee;
import com.tasks.task2.data.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeService {

    private static final Map<Long, Department> departmentMap = new HashMap<>();
    private static final Map<Long, Location> locationMap = new HashMap<>();
    private static final Map<Long, Benefits> benefitsMap = new HashMap<>();


    static {
        // Healthcare, finance, admin, fraud

        Department healthCare = new Department(1, "health care");
        Department finance = new Department(2, "finance");
        Department admin = new Department(3, "admin");
        Department fraud = new Department(4, "fraud");

        departmentMap.put(1L, healthCare);
        departmentMap.put(2L, finance);
        departmentMap.put(3L, admin);
        departmentMap.put(4L, fraud);

        locationMap.put(1L, new Location(1, "Hyderabad", "India"));
        locationMap.put(2L, new Location(2, "chennai", "India"));
        locationMap.put(3L, new Location(3, "London", "United Kingdom"));

        benefitsMap.put(1L, new Benefits(1, "rent", " House provided"));
        benefitsMap.put(2L, new Benefits(2, "travel", "Travel provided"));
        benefitsMap.put(3L, new Benefits(3, "HealthInsurance", "HealthInsuranceProvided "));

    }

    //   2.a) RETRIVE ALL EMPLOYEES IN INDIA..............................................................!

    public List<Employee> employeesInIndia(List<Employee> employees) {
        Predicate<Employee> predicate1 = (emp) -> locationMap.get(emp.getLocationId()).
                getLocationCountry().equalsIgnoreCase("india");

        return employees.stream().filter(predicate1).collect(Collectors.toList());
    }

//  2.b) RETRIEVE  EMPLOYEES WHO ARE IN CHENNAI or HYDERABAD...........................................!

    public List<Employee> retriveEmployeeWhoareInChennaiOrHyd(List<Employee> employees) {
        Predicate<Employee> predicate2 = (emp2) -> locationMap.get(emp2.getLocationId()).getLocationName().
                equalsIgnoreCase("Chennai")
                ||
                locationMap.get(emp2.getLocationId()).getLocationName().
                        equalsIgnoreCase("Hyderabad");

        return employees.stream().filter(predicate2).collect(Collectors.toList());
    }
// 2.c) Retrieve employees who have Benefits and display benefits details......................................!

    public String retriveEmployeeWhoHaveBenifits(List<Employee> employees) {

        for (int i = 0; i < employees.size(); i++) {

            Employee emp = employees.get(i);

            List<Long> benefitsList = emp.getBenefitId();


            if (benefitsList != null) {
                System.out.println(" Employee ID : " + emp.getEmployeeId());
                System.out.println(" EmployeeName :  " + emp.getEmployeeName());
                for (int j = 0; j < benefitsList.size(); j++) {
                    Benefits ben = benefitsMap.get(benefitsList.get(j));
                    if (ben != null) {
                        System.out.println(ben.getDescriptionOfBenefits());
                    }
                }
            }

        }


        return "-----------------------------------------------------------------------------";
    }

    //  2.d) Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry
    public String retriveEmployeeDetails(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            System.out.println("EmployeeID : " + emp.getEmployeeId());
            System.out.println("EmployeeName : " + emp.getEmployeeName());

            System.out.println("Employee Salary : " + emp.getSalary());

            Department dept = departmentMap.get(emp.getDeptId());
            System.out.println("Department Name : " + dept.getDeptName());
            System.out.println("Department Id : " + dept.getDeptId());

            Location loc = locationMap.get(emp.getLocationId());
            System.out.println(loc.getLocationName());
            System.out.println(loc.getLocationCountry());

            System.out.println();


        }
        return "--------------------------------2.d------------------------------------------";
    }

    // 2.e) Retrieve employees who are in Chennai and India

    public List<Employee> retriveEmployeeWhoareInChennaiOrIndia(List<Employee> employees) {
        Predicate<Employee> predicate2 = (emp2) -> locationMap.get(emp2.getLocationId()).getLocationName().
                equalsIgnoreCase("Chennai")
                &&
                locationMap.get(emp2.getLocationId()).getLocationCountry().
                        equalsIgnoreCase("India");

        return employees.stream().filter(predicate2).collect(Collectors.toList());

    }
}



