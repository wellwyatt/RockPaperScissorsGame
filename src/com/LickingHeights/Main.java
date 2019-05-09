package com.LickingHeights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    String rock,paper,scissors;
    long comNum;
      comNum = Math.round(2 * Math.random());
        Scanner keyboard = new Scanner(System.in);

        String [] comPlay = new String[3];
        comPlay[0] = "paper";
        comPlay[1] = "rock";
        comPlay[2] = "scissors";
        System.out.println("the Computer played "+ comPlay[(int) comNum]);


    }
}


