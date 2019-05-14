package com.LickingHeights;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userPlay;
        String[] comPlay = new String[3];
        int comInt = (int) Math.round(2 * Math.random());
        int userScore = 0, comScore = 0;
        comPlay[0] = "R";
        comPlay[1] = "P";
        comPlay[2] = "S";

        System.out.println(comPlay[comInt]);
        System.out.println("Enter in your play. (R = rock, P = paper, S = scissors)");
        userPlay = keyboard.next();
        userPlay = userPlay.toUpperCase();
        System.out.println(comPlay[comInt]);

        if (userPlay.equals(comPlay[comInt])) {
            System.out.println("It's a tie");
        }
        



    }
}










