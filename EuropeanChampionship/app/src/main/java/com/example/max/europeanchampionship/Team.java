package com.example.max.europeanchampionship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Model.Player;

public class Team extends Home {

    private TextView teamName;
    private Button btnCompo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        teamName = (TextView) findViewById(R.id.teamName);
        btnCompo = (Button) findViewById(R.id.buttonComposition);

        setTeamName();
        setButtonListeners();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.actionBarHome:
                startActivity(new Intent(Team.this, Home.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void setTeamName()
    {
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null){
            teamName.setText(bundle.getString("teamName"));
        }
    }

    public void setButtonListeners()
    {
        btnCompo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Team.this,Composition.class);
                ArrayList<Player> players = new ArrayList<>();
                players.add(new Player(1,"Keeper","David De Gea", 24));
                players.add(new Player(4,"Defender","Phil Jones", 23));
                intent.putExtra("compo", players);
                startActivity(intent);
            }
        });

        //listener ranking
    }
}
