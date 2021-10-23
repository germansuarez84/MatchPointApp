package com.example.matchpointapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.matchpointapp.entity.Team;

public class MainActivity extends AppCompatActivity {

    private EditText etTeam1, etTeam2;
    Team team1, team2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTeam1=findViewById(R.id.etTeam1);
        etTeam2=findViewById(R.id.etTeam2);
    }

    public void loadMatch(View view){
        //Toast.makeText(this,"Hola", Toast.LENGTH_SHORT).show();
        if(etTeam1.getText().toString().length()==0)
            Toast.makeText(this,getString(R.string.HomeValidator), Toast.LENGTH_SHORT).show();
        else if(etTeam2.getText().toString().length()==0)
                Toast.makeText(this,getString(R.string.VisitorValidator), Toast.LENGTH_SHORT).show();
                    else
                        {
                            team1=new Team(etTeam1.getText().toString());
                            team2= new Team(etTeam2.getText().toString());
                            Intent matchActivity = new Intent(this, MatchActivity.class);
                            matchActivity.putExtra("team1",team1);
                            matchActivity.putExtra("team2",team2);

                            startActivity(matchActivity);
                        }

    }
}