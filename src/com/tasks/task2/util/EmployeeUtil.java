package com.tasks.task2.util;

import com.tasks.task2.data.Benefits;
import com.tasks.task2.data.Department;
import com.tasks.task2.data.Location;

import java.util.HashMap;
import java.util.Map;

public class EmployeeUtil {



    private static Map<Long, Department> departmentMap = new HashMap<>();
    private static Map<Long, Location> locationMap = new HashMap<>();
    private static Map<Long, Benefits> benefitsMap = new HashMap<>();

    // Healthcare, finance, admin, fraud

    public void addValues() {

        Department healthCare = new Department(1, "health care");
        Department finance = new Department(2, "finance");
        Department admin = new Department(3, "admin");
        Department fraud = new Department(4, "fraud");

        departmentMap.put(1l, healthCare);
        departmentMap.put(2l, finance);
        departmentMap.put(3l, admin);
        departmentMap.put(4l, fraud);

        locationMap.put(1l, new Location(1, "Hyderabad", "India"));
        locationMap.put(2l, new Location(2, "chennai", "India"));
        locationMap.put(3l, new Location(3, "London", "United Kingdom"));

        benefitsMap.put(1l, new Benefits(1, "rent", " House provided"));
        benefitsMap.put(2l, new Benefits(2, "travel", "Travel provided"));
        benefitsMap.put(3l, new Benefits(3, "HealthInsurance", "HealthInsuranceProvided "));

    }
}


