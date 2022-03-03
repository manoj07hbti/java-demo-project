package collection_demo;

import model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {

    public void createMap(){

        // HashMap <Datatype_Key, Datatype_value> objName= new HashMap();

        HashMap <Integer, Employee> employeeHashMap= new HashMap<>();

        // create object of employee model class
        Employee employee= new Employee("Raj",1,"CS");
        Employee employee1= new Employee("Ramesh",2,"IT");
        Employee employee2= new Employee("Rahul",6,"CS");

        // add
        employeeHashMap.put(1,employee);
        employeeHashMap.put(2,employee2);
        employeeHashMap.put(3,employee1);

        for (Integer var: employeeHashMap.keySet()){

            System.out.println("Printing emp map name: " +employeeHashMap.get(var).getName() );
            System.out.println("Printing emp ID : " +employeeHashMap.get(var).getEmp_id() +" Dept : "+employeeHashMap.get(var).getDept() );
        }


    }

    public static void main(String[] args) {
        EmployeeHashMap obj= new EmployeeHashMap();
        obj.createMap();
    }
}
