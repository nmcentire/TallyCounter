package com.example.student.tallycounter;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    int count;
    TextView textView;


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            count++;
            textView.setText("Count = " + count);
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        Log.i("DEMO", "ONE");


        textView = new TextView(this);
        textView.setText("Count = 0");
        setContentView(textView);
        textView.setBackgroundColor(Color.YELLOW);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            //Toast.makeText(this,"TODO: Clear the count",Toast.LENGTH_LONG).show();
            count = 0;
            textView.setText("Count = 0");
            return true;
        }
        if (id == R.id.action_about) {
            Toast.makeText(this,"This app by Norman McEntire",Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
