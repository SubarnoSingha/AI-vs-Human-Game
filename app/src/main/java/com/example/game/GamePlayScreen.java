package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GamePlayScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play_screen);

        boolean isAITurn = false;
        boolean isPlayerWin = false;
        boolean isPlayerLose = false;
        while (!isPlayerWin && !isPlayerLose) {
            // Player's turn
            int coins = 0;
            if (!isAITurn) {
                int coinsToPick = getCoinsToPick();
                if (coinsToPick > coins) {
                    System.out.println("Invalid move. Please try again.");
                    continue;
                }
                coins -= coinsToPick;
                System.out.println("You picked " + coinsToPick + " coins. " + coins + " coins remaining.");
                if (coins == 0) {
                    isPlayerLose = true;
                }
                isAITurn = true;
            }
            // AI's turn
            else {
                int coinsToPick = calculateAIMove();
                coins -= coinsToPick;
                System.out.println("AI picked " + coinsToPick + " coins. " + coins + " coins remaining.");
                if (coins == 0) {
                    isPlayerWin = true;
                }
                isAITurn = false;
            }
        }    }

    private int calculateAIMove() {
        return 0;
    }

    private int getCoinsToPick() {
        return 0;
    }
}