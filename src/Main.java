//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grading Program");
        System.out.println("Provides letter grade given number grade.");
        System.out.println("Please input a number grade: ");
        double numberGrade = 89;
        numberGrade = scanner.nextDouble();
        System.out.println("Number grade is " + numberGrade);
        if (numberGrade >= 90){
            System.out.println("You get an A");
        }
        else if (numberGrade >= 80){
            System.out.println("You get a B");
        }
        else if (numberGrade >= 70){
            System.out.println("You get a C");
        }
        else if (numberGrade >= 60){
            System.out.println("You get a D");
        }
        else{
            System.out.println("I can't give your letter grade");
        }

    }
}