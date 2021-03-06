package collection_demo;

import org.omg.CORBA.INTERNAL;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class DemoHashSet {

    public void createHashSet(){

        //SYNTAX : CollectionName<Datatype> objName= New CollectionName();

        HashSet <String>  stringHashSet= new HashSet<>();

        LinkedHashSet <String > stringLinkedHashSet= new LinkedHashSet<>();
        stringLinkedHashSet.add("Test1");
        stringLinkedHashSet.add("Test2");
        stringLinkedHashSet.add("Test3");
        stringLinkedHashSet.add("Test4");

        for (String var : stringLinkedHashSet){

            System.out.println("Printing stringLinkedHashSet "+var);
        }


        stringHashSet.add("Java");
        stringHashSet.add("Java");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring Boot");

        for (String var : stringHashSet){

            System.out.println("Printing Hashset: "+var);
        }

    }

    public void createIntegerSet(){

        HashSet <Integer> integerHashSet= new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(1);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(2);
        integerHashSet.add(2);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(3);

        for (Integer var: integerHashSet){

            System.out.println("Printing integerHashSet: "+var);
        }


    }
    public void createDoubleSet(){

        HashSet <Double> doubles= new HashSet();
        doubles.add(45.6);
        doubles.add(45.6);
        doubles.add(44.6);
        doubles.add(476.6);
        doubles.add(45.6);

        for (Double var: doubles){

            System.out.println("Printing Doubles "+var);
        }
    }

    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        obj.createHashSet();
        obj.createIntegerSet();
        obj.createDoubleSet();
    }
}
