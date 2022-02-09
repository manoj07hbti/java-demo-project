public class ArraysDemo {

    public static void main(String[] args) {

        String cityname="AGRA";
        String cityname1="Delhi";
        String cityname2="Pune";
        String cityname3="Jaipur";

        // SYNTAX: DataType var_name []={value1,value2, value3.....};

       String cities [] = {"AGRA","Delhi","Pune","Jaipur","Chennai"};

        System.out.println(cities[0]);

        System.out.println(cities[2]);

        System.out.println(cities[4]);

        // for loop
        for (int i=0; i<cities.length; i++){

            System.out.println("Printing ArrayList using for loop "+ cities[i]);
        }

        // advance for  loop : for (Datatype var: array){CODE }

        for (String var: cities){

            System.out.println("Printing using advance for loop "+var);
        }

        // SYNTAX: DataType var_name []={value1,value2, value3.....};

        int marks []={45,56,76,34,78,67,98};

        for (int var: marks){

            System.out.println("Printing marks array "+var);
        }

        double prices[] = {34.5, 563.6, 345.5,4545.4, 45.6,73.5};

        for (double var: prices){

            System.out.println("Printing price array "+var);
        }

    }
}
