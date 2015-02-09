package com.example.spencer.swirlytap;

import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class singlePlayer extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        //countdown from 60 seconds ...
        new CountDownTimer(60000, 1000) {
            //create new type textview and relate it to countdown textbox in activity_single_player.xml
            TextView mTextField = (TextView) findViewById(R.id.countdown);
            public void onTick(long millisUntilFinished) {
                //display seconds left in text field
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }
            //stop time/game when time is up
            public void onFinish() {
                mTextField.setText("done!");
            }
        }.start();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_single_player, menu);
        return true;
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
}
