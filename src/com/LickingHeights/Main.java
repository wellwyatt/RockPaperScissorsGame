package com.LickingHeights;


import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userScore = 0, comScore = 0;
        String userPlay;
        System.out.println("Enter in your play. (R = rock, P = paper, S = scissors)");
        System.out.println("Type \'reset\' to Start Over");
        while (true) {

            String red = ("\u001B[31m");
            String cReset = "\u001B[0m";
            String green = "\u001B[32m";
            String[] comPlay = new String[3];
            int comInt = (int) Math.round(2 * Math.random());

            comPlay[0] = "R";
            comPlay[1] = "P";
            comPlay[2] = "S";

            userPlay = keyboard.nextLine();
            userPlay = userPlay.toUpperCase();

            if (userScore == 5 || comScore == 5) {
                userScore = 0;
                comScore = 0;
            }
            if (userPlay.equals(comPlay[comInt])) {
                System.out.println("It's a tie");
            } else if (userPlay.equals("R") && (comPlay[comInt].equals("S"))) {
                System.out.println("Rock Beats Scissors," + green + " YOU WIN!" + cReset);
                userScore++;
            } else if (userPlay.equals("P") && (comPlay[comInt].equals("R"))) {
                System.out.println("Paper Beats Rock," + green + " YOU WIN" + cReset);
                userScore++;
            } else if (userPlay.equals("S") && (comPlay[comInt].equals("P"))) {
                System.out.println("Scissors Beats Paper," + green + " YOU WIN!" + cReset);
                userScore++;
            } else if (userPlay.equals("S") && (comPlay[comInt].equals("R"))) {
                System.out.println("Rock Beats Scissors," + red + "YOU LOSE" + cReset);
                comScore++;
            } else if (userPlay.equals("R") && (comPlay[comInt].equals("P"))) {
                System.out.println("Paper Beats Rock," + red + "YOU LOSE" + cReset);
                comScore++;
            } else if (userPlay.equals("P") && (comPlay[comInt].equals("S"))) {
                System.out.println("Scissors Beats Paper," + red + "YOU LOSE" + cReset);
                comScore++;
            }
            if (userScore == 5) {
                System.out.println("You Win the Game!!! , enter another play to start again.");
            } else if (comScore == 5) {
                System.out.println("You Lose, Better Luck Next Time , enter another play to start again.");

            } else if (userPlay.equals("RESET")) {
                userScore = 0;
                comScore = 0;
            }

            System.out.println(("\033[1;96m") + "Computer = " + comScore + " - You = " + userScore + cReset);
            if (userScore == 0 && comScore == 0) {
                System.out.println("The Game Has Been Reset.");
            }


        }
    }
}









