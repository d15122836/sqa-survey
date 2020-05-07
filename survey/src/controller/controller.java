package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class controller {
    public static void createSurvey(String name){
        int i=1;
        int resp=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> surveyQues = name.getItems();
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
        Iterator itr = listSurvey.iterator();
        System.out.println("Listing all the surveys");
        while(itr.hasNext()){
            System.out.println(itr);
        }
    }
    public static ArrayList<String> getSurvey(String surveyName) {
        Iterator itr = listSurvey.iterator();
        while (itr.hasNext()) {
            String survey = null;
            if (surveyName == itr.next()) {
                System.out.println("Survey Found");
                survey = itr.next();
            } else {
                System.out.println("Survey Not found");
            }
        }
        return survey;
    }
}



