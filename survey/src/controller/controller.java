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

}



