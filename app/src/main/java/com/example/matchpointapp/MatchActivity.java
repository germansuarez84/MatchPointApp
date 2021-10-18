package com.example.matchpointapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.matchpointapp.entity.Team;

public class MatchActivity extends AppCompatActivity {
    private Team team1, team2;
    private TextView tvTeam1, tvTeam2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match2);
        Intent inputIntent= getIntent();

        team1= (Team)inputIntent.getSerializableExtra("team1");
        team2= (Team)inputIntent.getSerializableExtra("team2");

        tvTeam1= findViewById(R.id.tvTeam1);
        tvTeam2= findViewById(R.id.tvTeam2);

        addHomePoints(0);
        addVisitorPoints(0);
        /*tvTeam1.setText(team1.getScore());
        tvTeam2.setText(team2.getScore());*/
    }

    public void addHomePoints(int points){
        team1.addPoints(points);
        tvTeam1.setText(team1.getScore());

    }

     public void addVisitorPoints(int points){
        team2.addPoints(points);
         tvTeam2.setText(team2.getScore());
    }

    public void addPoint(View view){
        String [] parameters = view.getTag().toString().split("-");

        if(parameters[0].equals("0"))
            addHomePoints(Integer.valueOf(parameters[1]));
        else
            addVisitorPoints(Integer.valueOf(parameters[1]));

    }
}