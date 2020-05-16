package test;
import java.util.Scanner;
import static controller.controller.modifySurvey;

public class test_modify {
    public static void main(String args[]) {


        System.out.println("Calling modify function for test");
        System.out.println("Enter the survey Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        modifySurvey(name);
    }
}
