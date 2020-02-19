package com.example.myjokessource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class JokesSource {

   private String[] j = {"Q: Why should you sit in a corner when you get cold?\n" +
            "A: Because most corners are 90 degrees.",

            "Q. What is the biggest lie in the entire universe?\n"+
           "A. \"I have read and agree to the Terms & Conditions.\" ",
    "Why are iPhone chargers not called Apple Juice?! :P",

    "My computer suddenly started belting out \"Someone Like You\" It's a Dell.",

    "Q: What does the zero say to the eight?\n" +
            "A: Nice belt!",

    "Q: Why did the two 4's skip lunch?\n" +
            "A: They already 8 (ate)!",

    "Q: Whats the difference between love and marriage?\n" +
            "A: Love is blind and marriage is an eye-opener!",

    "When I see lovers' names carved in a tree, I don't think it's sweet. " +
            "I just think it's surprising how many people bring a knife on a date.",

    "My old aunts would come and tease me at weddings, \"Well Sarah? Do you think you'll be next?\"\n"+
            "We've settled this quickly once I've started doing the same to them at funerals.",

    };
    private ArrayList<String> jokes = new ArrayList<>(Arrays.asList(j)) ;

    public String getJoke(){

        Random random=new Random();
        return jokes.get(random.nextInt(jokes.size()));

    }
}
