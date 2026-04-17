package com.pluralsight;

import java.util.Scanner;

public class HighscoreWins {
    public static void main(String[] args) {

        //Converting strings so we can read input from keyboard
        Scanner scanner = new Scanner(System.in);

        //Ask the user to enter the game score in the required format
        System.out.print("Please enter a game score: ");

        //Reading the entire line the user types
        String input = scanner.nextLine();

        //Split the input into two parts using the pipe symbol |
        String[] parts = input.split("\\|");

        //Split the team names using :
        String[] teams = parts [0].split(":");
        String homeTeam = teams [0];
        String visitorTeam = teams[1];

        //Split the scores using:
        String[] scores = parts[1].split(":");

        //Convert the score strings into integers so they can be compared
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        //Store the winning team name
        String winner;

        //Compare the two scores and choose the team with the higher score
        if(homeScore > visitorScore){
            winner = homeTeam;
        }
        else {
            winner = visitorTeam;
        }
        //Display the winner
        System.out.println(" Winner: " + winner);

        //Close the scanner
        scanner.close();

    }
}
