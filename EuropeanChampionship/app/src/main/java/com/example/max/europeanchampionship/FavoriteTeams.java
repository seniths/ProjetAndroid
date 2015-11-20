package com.example.max.europeanchampionship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriteTeams extends Home {

    private ListView teamsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_teams);

        teamsList = (ListView) findViewById(R.id.teamsListView);

        initTeams();
    }

    public void initTeams()
    {
        //remplir la liste avec les equipes favorites
        final ArrayList<String> equipes = new ArrayList<>();
        equipes.add("ManU");
        equipes.add("Liverpool");
        equipes.add("Chelsea");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, equipes);

        teamsList.setAdapter(adapter);

        teamsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FavoriteTeams.this, Team.class);
                intent.putExtra("teamName", equipes.get(position));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.actionBarHome:
                startActivity(new Intent(FavoriteTeams.this, Home.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
