package ch8TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class Coffee extends CaffeineBeverage {
    protected void addCondiments() {
        System.out.println("Dripping coffee through filter");

    }


    @Override
    protected boolean customerWantsCondiments() {
        String userInput = getUserInput();

        if (userInput.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }

    }

    private String getUserInput() {

        String userInput = "";

        System.out.println("would you like to add condiments?(y/n)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("I/O Error trying to read your answer");
        }

        if (userInput == ""){
            return "no";
        }
        return userInput;

    }

    protected void brew() {
        System.out.println("Adding sugar and milk");

    }


}
