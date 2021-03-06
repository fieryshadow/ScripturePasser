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
        setContentView(R.layout.activity_scripture_displayer);
        Intent intent = getIntent();

        final TextView textView = (TextView) findViewById(R.id.displayText);
        String book = intent.getStringExtra(MainActivity.BOOK_KEY);
        String chapter = intent.getStringExtra(MainActivity.CHAPTER_KEY);
        String verses = intent.getStringExtra(MainActivity.VERSE_KEY);
        textView.setText(book + " " + chapter + ":" + verses);
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
