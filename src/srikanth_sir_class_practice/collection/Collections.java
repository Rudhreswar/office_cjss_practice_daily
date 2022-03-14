package srikanth_sir_class_practice.collection;


import java.util.*;

public class Collections {


    /**
     * ArrayList - To store collection of elements. Insertion order - same, duplicates allowed
     * HashSet - Insertion order - unordered
     * HashMap - hash table based implementation of Java
     * Generics - Restrict the type of object that can be stored in collection
     */


    public static void main(String args[]) {

        List al1 = new ArrayList();
        al1.add("Rama");
        al1.add("test");
        al1.add("test");
        al1.add("Rama");
        al1.add(10);
        al1.add(10.2);

//        System.out.println(al1.size());
//        System.out.println(al1.get(0));
//        System.out.println(al1);

        /*for (int i =0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }*/

        /*for (Object element: al1) {
            System.out.println(element);
        }*/


        // al1.get(0);
        // al1.add(1, "newTest");
        // al1.set(2, "newTest");
        // remove()
        // set(0, "test")


//        System.out.println(al1);
//         for (Object o: al1) {
//            System.out.println(o);
//        }

        Set set1 = new HashSet();
        set1.add("Rama");
        set1.add("test1");
        set1.add("test");
        set1.add("Rama");
        set1.add("10");
        set1.add("10.2");

//        System.out.println(set1);

        Map map1 = new HashMap();
        map1.put("gmail", "g123");
        map1.put("mac", "m123");
        map1.put("hotmail", 123);

        for (Object key : map1.keySet()) {
//            System.out.println("Key: " + key + " value: " + map1.get(key));
        }


        List<Float> al2 = new ArrayList<>();
        al2.add(10f);
        al2.add(20f);

//         for (Float o: al2) {
//            System.out.println(o);
//        }


        Map<String, String> map2 = new HashMap<>();
        map2.put("gmail", "g123");
        map2.put("mac", "m123");
//        map2.put("hotmail", 123);


        // employeeNo,name,salary
        //

        List<EmployeeModel> employees = new ArrayList<>();
        EmployeeModel employee1 = new EmployeeModel("E101", "Name1", "10000");
        EmployeeModel employee2 = new EmployeeModel("E102", "Name2", "20000");
//        employee2.setEmployeeNo("E102");
//        employee2.setEmployeeName("Name2");
//        employee2.setSalary("20000");

        employees.add(employee1);
        employees.add(employee2);

        for (EmployeeModel employee : employees) {
            System.out.println(employee.getEmployeeNo() + " : " + employee.getEmployeeName() + " : " + employee.getSalary());

        }


    }
}



