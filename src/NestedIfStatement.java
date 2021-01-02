import java.util.*;

public class NestedIfStatement {
    // this is an if statement inside an if statement
    public static void main (String[] args) {
        //checking if a number is between 5 and 10
        int number = 7;
        if(number > 5){
            if(number < 10){
                System.out.println("The number is between 5 and 10");
            }
        }

//        int number = 11;
//        if(number > 5){
//            if(number < 10){
//                System.out.println("The number is between 5 and 10");
//
//        } // doesn't print anything since the number is not between 5 and 10

//        int number = 11;
//        if(number > 5){
//            System.out.println("The number is greater than 5"); // only prints here
//
//            if(number < 10){
//                System.out.println("The number is between 5 and 10"); // false, doesn't print
//            }
//        }




    }
}
