package com.example.max.europeanchampionship;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ActionMenuView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import Model.Player;

public class Composition extends Home {

    private TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composition);

        table = (TableLayout) findViewById(R.id.tableCompo);

        initTable();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.actionBarHome:
                startActivity(new Intent(Composition.this, Home.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void initTable()
    {
        Bundle bundle = this.getIntent().getExtras();
        ArrayList<Player> players = (ArrayList<Player>) bundle.getSerializable("compo");

        TableRow row;
        TextView num;
        TextView pos;
        TextView name;
        TextView age;

        for(Player p : players)
        {
            row = new TableRow(Composition.this);

            num = new TextView(Composition.this);
            num.setText(p.getNum().toString());
            num.setLayoutParams(new TableRow.LayoutParams(0));
            num.setGravity(Gravity.CENTER);
            row.addView(num);

            pos = new TextView(Composition.this);
            pos.setText(p.getPosition());
            pos.setLayoutParams(new TableRow.LayoutParams(1));
            pos.setGravity(Gravity.CENTER);
            row.addView(pos);

            name = new TextView(Composition.this);
            name.setText(p.getName());
            name.setLayoutParams(new TableRow.LayoutParams(2));
            name.setGravity(Gravity.CENTER);
            row.addView(name);

            age = new TextView(Composition.this);
            age.setText(p.getAge().toString());
            age.setLayoutParams(new TableRow.LayoutParams(3));
            age.setGravity(Gravity.CENTER);
            row.addView(age);

            table.addView(row);
        }
    }
}
