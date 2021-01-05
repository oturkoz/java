import java.util.Scanner;

public class GradingSystem_10 {
    public static void main(String[] args) {
        // If the student has a grade A print excellent work
        // If the student has a grade B print good work
        // If the student has a grade C print average work
        // If the student has a grade D print needs improvement
        // If the student has a grade F print fail


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your grade:");
//        String grade = scan.next();
//
//        // char grade = 'A'; input user dan alinmayacaksa yukaridaki 3 satirin yerine sadece bu satir yazilabilir
//        switch (grade){
//            case "A":
//                System.out.println("excellent work");
//                break;
//            case "B":
//                System.out.println("good work");
//                break;
//            case "C":
//                System.out.println("average work");
//                break;
//            case "D":
//                System.out.println("needs improvement");
//                break;
//            case "F":
//                System.out.println("fail");
//                break;
//            default:
//                System.out.println("not a valid entry");
//        }



        char grade = 'A';
        if(grade == 'A') {
            System.out.println("excellent");
        }
        else if(grade== 'B') {
            System.out.println("good");
        }
        else if(grade == 'C') {
            System.out.println("average");
        }
        else if(grade == 'D') {
            System.out.println("needs improvement");
        }
        else if(grade =='F') {
            System.out.println("fail");
        }
        else {
            System.out.println("nothing");
        }

    }
}
