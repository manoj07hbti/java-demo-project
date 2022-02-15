package method_and_object;

import java.util.Scanner;

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

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Welcome to Calculator App Please enter your choice:" +
                            "1 for add, 2 sub, 3 for multi and 4 for divide ");
        int choice= scanner.nextInt();
        System.out.println("  Please enter value of a : ");
        int a=scanner.nextInt();
        System.out.println("Please enter value of b : ");
        int b= scanner.nextInt();

        if (choice==1){
            obj.add(a,b);
        }
        else if (choice==2){
            obj.subtraction(a,b);
        }


    }
}
