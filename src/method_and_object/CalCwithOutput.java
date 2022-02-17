package method_and_object;

public class CalCwithOutput {

    public int addition(int a, int b){

        int result= a+b;

        return result;
    }

    public int sub(int a, int b ){

        int result= a-b;

        return result;
    }


    public static void main(String[] args) {
        CalCwithOutput obj= new CalCwithOutput();
        int result = obj.addition(3,6);
        System.out.println("Addition is "+result);
        int sub= obj.sub(17,4);
        System.out.println("Subtraction is "+sub);
    }
}
