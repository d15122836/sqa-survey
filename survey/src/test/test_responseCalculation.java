package test;

import controller.resp;

import java.util.Scanner;

import static controller.controller.responseCalculation;

public class test_responseCalculation {
    public static void main(String args[]){
        System.out.println("Enter the survey name for calculating the response");
        Scanner sc = new Scanner(System.in);
        String surveyName = sc.next();
        resp Response = responseCalculation(surveyName);
        System.out.println("Standard Deviation : " +Response.standardDeviation);
        System.out.println("Maximum Value : " +Response.maxValue);
        System.out.println("Minimum Value : " + Response.minValue);
    }

}
