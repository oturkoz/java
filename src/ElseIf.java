
public class ElseIf {
    public static void main(String[] args) {
        // used to specify a new condition to test, whwn the if statement is false
        // keyword is "else if"
        // followed by parenthesis and a statement inside and curly brackets
        // the result of the condition needs to be boolean
        // if the first statement is false (if yani) ve else if is true then else if works

//        int number = 1;
//        if(number>5){
//            System.out.println("The number is greater than 5");
//        }
//        else if(number == 5){ // you can use more than one else if statements
//            System.out.println("The number is equal to 5");
//        }
//        else{ // you don't need else statement to run "if" or "else if" statements
//            System.out.println("The number is less than 5");
//        }
//        int number = 10;
//        if (number > 5) {
//            if (number < 10) {
//                System.out.println("The number is between 5 and 10");
//            }
//            else if(number ==10){
//                System.out.println("The number is equal to 10");
//            }
//            else {
//                System.out.println("The number is greater than 10");
//            }
//        }


//        int number = 20;
//        if(number >10 && number < 100) //seklinde iki kosul uygulanabilir
//        if(number < 10){
//            System.out.println("The number is one digit");
//        }
//        else if(number < 100){
//            System.out.println("The number is two digits");
//        }
//        else if(number < 1000){
//            System.out.println("The number is three digits");
//        }
//        else if(number < 10000){
//            System.out.println("The number is four digits");
//        }
//        else {
//            System.out.println("The number is more than four digits ");
//        }


        int number = 2;
        if(number < 10){
            System.out.println("The number has one digit");
        }
        if (number > 100){
            System.out.println("The number has two digits");
        }
        // else statement sadece en sondaki if statement a gore calisir. oncekilere bakmaz
        else {
            System.out.println("Inside else");
        }

    }
}
