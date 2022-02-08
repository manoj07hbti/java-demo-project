package loop_working;

public class WhileLoop {

    public static void main(String[] args) {

        //     while(condition){  CODE }

        int i=0;

        while (i<5){

            System.out.println("Hello "+i);
            i++;
        }


        //do {CODE }
        // while(condition);
        int j=0;
        do {
            System.out.println("Hello with DO while "+j);
            j++;
        }
        while (j<5);


    }
}
