package conditional_statements;

public class Demo {

    public static void main(String[] args) {

        // SYNTAX: if(condition){
        //
        ////                 code to be executed
        //             }

        int age=17;

        if(age>18){

            System.out.println("Eligible for voting .....");
        }
        else {
            System.out.println("NOT Eligible for voting ....");
        }

        String cityName="DELHI";

        if(cityName=="PUNE"){

            System.out.println("You are in Pune ..");
        }
        else {
            System.out.println("You are NOT in Pune ..");
        }

        double price=1422.7;

        if (price>3000){
            System.out.println("Product is costly");
        }
        else {
            System.out.println("Product is NOT costly");
        }

    }
}
