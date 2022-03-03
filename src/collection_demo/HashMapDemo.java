package collection_demo;

import java.util.HashMap;

public class HashMapDemo {

   // HashMap <Datatype_Key, Datatype_value> objName= new HashMap();

    public void createHashMap(){

        HashMap <Integer, String> hashMap= new HashMap<>();

        // adding element to map
        hashMap.put(1,"Java");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Spring Boot");
        hashMap.put(3,"Microservice");

        // getting a element from map

        System.out.println(hashMap.get(3));

        for (Integer var: hashMap.keySet()){

            System.out.println("Printing Map "+hashMap.get(var));
        }

        // deleting an element

        hashMap.remove(1);
        System.out.println(hashMap.get(1));

    }

    public static void main(String[] args) {
        HashMapDemo obj= new HashMapDemo();
        obj.createHashMap();
    }
}
