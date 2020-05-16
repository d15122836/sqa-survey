package controller;

import org.HdrHistogram.DoubleHistogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class controller {
    public static void createSurvey(String name){
        int i=1;
        int resp=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> surveyQues = addQuestions(name);
        HashMap<String, Integer> surveyResponse = new HashMap<String, Integer>();
        Iterator itr = surveyQues.iterator();
        while(itr.hasNext()){
            String question = (String) itr.next();
            System.out.println("Question "+i +":" +question);
            resp = sc.nextInt();
            surveyResponse.put(question, resp);
        }
    }
    public static void listSurvey(){

        DoubleHistogram.AllValues listSurvey = null;
        Iterator itr = listSurvey.iterator();
        System.out.println("Listing all the surveys");
        while(itr.hasNext()){
            System.out.println(itr);
        }
    }
    public static String getSurvey(String surveyName) {
        DoubleHistogram.AllValues listSurvey = null;
        Iterator itr = listSurvey.iterator();
        String survey = null;
        while (itr.hasNext()) {
            survey = null;
            if (surveyName == itr.next()) {
                System.out.println("Survey Found");
                survey = (String) itr.next();
            } else {
                System.out.println("Survey Not found");
                survey = null;
            }
        }
        return survey;
    }
    public static void modifySurvey(String surveyName)
    {
        Scanner sc = new Scanner(System.in);
        Iterator itr;
        DoubleHistogram.AllValues listSurvey = null;
        itr = listSurvey.iterator();
        while (itr.hasNext()) {
            String survey = null;
            if (surveyName == itr.next()) {
                System.out.println("Survey Found");
                System.out.println("Calling Add function");
                addQuestions(surveyName);
                 }

                else {
                    System.out.println("Invalid Choice");
                    continue;
                }
            }
        }


    public static ArrayList<String> addQuestions(String surveyName) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> surveyNameQues = new HashMap<>();
        ArrayList<String> ques = new ArrayList<>();
        System.out.println("Enter the number of questions to add");
        int NoOfQues = sc.nextInt();

        for (int i = 0; i <= NoOfQues; i++) {
            System.out.println("Enter the Question");
            String quesToAdd = sc.next();
            surveyNameQues.put(surveyName, quesToAdd);
            ques.add(quesToAdd);
        }
        return ques;
    }

}





