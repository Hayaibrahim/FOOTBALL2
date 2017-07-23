package com.example.android.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static com.example.android.football.R.menu.*;

public class MainActivity extends AppCompatActivity {
    int goal = 0;
    int off = 0 ;
    int mis = 0 ;
    int plus = 0;
    int min = 0;
    int bre = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //  getMenuInflater().inflate(R.menu.menu_main, menu);
        //      return true;
    }

    public void RESTART(View v) {

          plus = 0;
          min = 0;
        off =0 ;
        mis= 0 ;
        bre= 0 ;
        goal= 0 ;

        displayGoal(plus);
        displayGoalright(min);
        displayMistakescommitted(bre);
        displayoffsaid(off);
        displayGoal(goal);
        displayMistakescommittedright(mis);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayGoal(View v) {
        goal = goal + 1;
        displayGoal(goal);
    }

    public void displayGoal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Goal);
        scoreView.setText(String.valueOf(score));
    }

    //

    public void displayoffsaid(View v) {
        off = off + 2;
        displayoffsaid(off);
    }

    public void displayoffsaid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.offsaid);
        scoreView.setText(String.valueOf(score));
    }


    public void displayMistakescommittedd(View v) {
        mis= mis + 1;
        displayMistakescommitted(mis);
    }

    public void displayMistakescommitted(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Mistakescommitted);
        scoreView.setText(String.valueOf(score));
    }

    //all booton left
    ////////////////////////////////////////\
    public void displayGoalright(View v) {
        plus = plus + 1;
        displayGoalright(plus);
    }

    public void displayGoalright(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Goalright);
        scoreView.setText(String.valueOf(score));
    }

    public void offsaidright(View v) {
        min = min + 2;
        displayoffsaidright(min);
    }

    public void displayoffsaidright(int score) {
        TextView scoreView = (TextView) findViewById(R.id.offsaidright);
        scoreView.setText(String.valueOf(score));
    }


    public void displayMistakescommittedright(View v) {
       bre = bre + 4;
        displayMistakescommittedright(min);
    }

    public void displayMistakescommittedright(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Mistakescommittedright);
        scoreView.setText(String.valueOf(score));
    }


}

