package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;

public class LostScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_screen);

        // Lost Screen
        boolean isPlayerLose = false;
        int gamesWon = 0;
        int gamesLost = 0;
        if (isPlayerLose) {
            System.out.println("You lost the game.");
            gamesLost++;
        } else {
            System.out.println("You won the game.");
            gamesWon++;
        }
        int gamesPlayed = 0;
        gamesPlayed++;
        System.out.println("Total games played: " + gamesPlayed);
        System.out.println("Games won: " + gamesWon);
        System.out.println("Games lost: " + gamesLost);
        System.out.println("Play again? (y/n)");
        Scanner sc = new Scanner(System.in);
        String playAgain = sc.nextLine();
        if (playAgain.equals("y")) {
            main(null);
        }
    }

    private void main(Object o) {
    }

}
