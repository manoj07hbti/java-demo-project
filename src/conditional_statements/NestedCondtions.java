package conditional_statements;

public class NestedCondtions {

    public static void main(String[] args) {

        int age =13;
        String city="Delhi";
// AND OPERATOR
        if(age>18 && city=="AGRA"){

            System.out.println("Eligible for Voting in Agra");
        }
        else {
            System.out.println("Not Eligible");
        }

// NOT OPERATOR
        if(!(age>18 && city=="AGRA")){

            System.out.println("Eligible for Voting in Agra");
        }
        else {
            System.out.println("Not Eligible");
        }

// OR OPERATOR

        int marks=74;
        String section="BIO";

        if (marks>75 || section=="MATHS"){
            System.out.println("First division with MATHS");
        }
        else {
            System.out.println("Not in Maths section neither first division ");
        }

// NOT OPERATOR

        if ( !(marks>75) || !(section=="MATHS")){
            System.out.println("First division with MATHS");
        }
        else {
            System.out.println("Not in Maths section neither first division ");
        }

    }
}
