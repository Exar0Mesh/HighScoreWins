package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.print("Please enter a game score: ");
        String input = game.nextLine();
        String[] team = input.split(Pattern.quote("|"));
        String[] score = input.split(Pattern.quote(":"));

        String teams = team[0];
        String split = team[1];
        String home = score[0];
        String visitor = score[1];
        int homeNum = Integer.parseInt(score[2]);
        System.out.println(team[1]);
        System.out.println(score[1]);
        /*
        String[] team = input.split(Pattern.quote("|"));

        System.out.println(team[1]);
        /*

        if(visitorNum < homeNum) {
            System.out.println("Winner: "+ visitor);
        } else if(homeNum < visitorNum) {
            System.out.println("Winner: "+ home);
        } else {
            System.out.println("tie");
        }

         */
    }
}
