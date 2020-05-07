package test;

import java.util.Scanner;

import static controller.controller.getSurvey;

public class test_getSurvey {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the survey name");
        String surveyName = sc.next();
        getSurvey(surveyName);
    }
}
