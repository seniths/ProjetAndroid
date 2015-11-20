package com.example.max.europeanchampionship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class Home extends AppCompatActivity {

    private Button btnFav, btnChamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnFav = (Button) findViewById(R.id.buttonFav);
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, FavoriteTeams.class));
            }
        });

        btnChamp = (Button) findViewById(R.id.buttonChamp);
        btnChamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Championships.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.actionBarFav:
                startActivity(new Intent(Home.this, FavoriteTeams.class));
                return true;
            case R.id.actionBarChampionship:
                startActivity(new Intent(Home.this, Championships.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
