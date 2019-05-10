package com.LickingHeights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userPlay;
        String comPlay = "";
        int comInt = (int) (Math.random()*3);
        System.out.println(comInt);

        if (comInt==0)
            comPlay="R";
        else if (comInt==1)
            comPlay="S";
        else if (comInt==2)
            comPlay="P";

        System.out.println("Enter in your play. ( R = rock, P = paper, S = scissors)");
        userPlay = keyboard.nextLine();
        userPlay = userPlay.toUpperCase();
        System.out.println(userPlay);







        }

    }






