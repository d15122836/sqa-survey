package test;
import controller.controller;
import java.util.Scanner;

class test_createSurvey extends controller {
    public static void main(String args[])
    {
        controller control;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Testing Create Survey");
        System.out.println("Enter the survey name");
        name = sc.nextLine();
        createSurvey(name);
    }
}
