package edu.byui.shane.scripturepasser;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ScriptureDisplayer extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        //TextView textView = (TextView) findViewById(R.id.displayText);
        String message = intent.getStringExtra(MainActivity.EXTRA_KEY);
        //message += " " + intent.getStringExtra("chapter");
        //message += ":" + intent.getStringExtra("verse");
        TextView textView = new TextView(this);
        textView.setText("Your fav script: " + message);
        textView.setTextSize(22);
        setContentView(textView);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_scripture_displayer, menu);
//        return true;
//    }

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
