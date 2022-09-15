package com.booyah.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void viewthree_a (View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void viewtwo_a (View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void viewfreethrow_a (View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scores) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scores));
    }
        public void viewthree_b (View b){
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }

        public void viewtwo_b (View b){
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
        public void viewfreethrow_b (View b){
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
        public void resetScore(View v){
                scoreTeamA=0;
                scoreTeamB=0;
                displayForTeamB(scoreTeamB);
                displayForTeamA(scoreTeamA);
        }
}