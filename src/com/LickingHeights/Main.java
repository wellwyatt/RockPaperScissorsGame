package com.LickingHeights;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userScore = 0, comScore = 0;
        System.out.println("Enter in your play. (R = rock, P = paper, S = scissors)");

        while (true) {
            String userPlay;
            String[] comPlay = new String[3];
            int comInt = (int) Math.round(2 * Math.random());

            comPlay[0] = "R";
            comPlay[1] = "P";
            comPlay[2] = "S";

            userPlay = keyboard.next();
            userPlay = userPlay.toUpperCase();

            if (userPlay == "restart"){
                userScore = 0;
                comScore = 0;
            }



            if (userPlay.equals(comPlay[comInt])) {
                System.out.println("It's a tie");

            } else if (userPlay.equals("R") && (comPlay[comInt].equals("S"))) {
                System.out.println("Rock Beats Scissors,YOU WIN!");
                userScore++;
            } else if (userPlay.equals("P") && (comPlay[comInt].equals("R"))) {
                System.out.println("Paper Beats Rock, YOU WIN");
                userScore++;
            } else if (userPlay.equals("S") && (comPlay[comInt].equals("P"))) {
                System.out.println("Scissors Beats Paper, YOU WIN!");
                userScore++;
            } else if (userPlay.equals("S") && (comPlay[comInt].equals("R"))) {
                System.out.println("Rock Beats Scissors,YOU LOSE");
                comScore++;
            } else if (userPlay.equals("R") && (comPlay[comInt].equals("P"))) {
                System.out.println("Paper Beats Rock, YOU LOSE");
                comScore++;
            } else if (userPlay.equals("P") && (comPlay[comInt].equals("S"))) {
                System.out.println("Scissors Beats Paper, YOU LOSE");
                comScore++;
            }
            if (userScore == 5){
                System.out.println("You Win the Game!!!");
            }
            else if (comScore == 5){
                System.out.println("You Lose, Better Luck Next Time");
            }
            else
                System.out.println("enter in your play.");

            System.out.println("Computer = " + comScore + " - You = " + userScore);
            System.out.println("Type \"restart\" to start a new game");

        }
    }
}










