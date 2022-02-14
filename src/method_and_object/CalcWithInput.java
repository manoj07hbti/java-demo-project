package method_and_object;

public class CalcWithInput {

    public void add(int a, int b ){


        int result =a+b;

        System.out.println("Addition is : "+result);
    }

    public void subtraction(int a , int b ){

        int result= a-b;
        System.out.println("Subtraction  is : "+result);
    }

    public static void main(String[] args) {

        CalcWithInput obj= new CalcWithInput();
        obj.add(34,4);

        obj.subtraction(21,2);
    }
}
