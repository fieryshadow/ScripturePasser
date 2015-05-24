package edu.byui.shane.scripturepasser;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public static final String BOOK_KEY = "com.byui.shane.MainActivity.BOOK";
    public static final String CHAPTER_KEY = "com.byui.shane.MainActivity.CHAPTER";
    public static final String VERSE_KEY = "com.byui.shane.MainActivity.VERSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void submitScripture(View view) {
        Intent intent = new Intent(this, ScriptureDisplayer.class);
        intent.putExtra(MainActivity.BOOK_KEY, ((EditText) findViewById(R.id.sBook)).getText().toString());
        intent.putExtra(MainActivity.CHAPTER_KEY, ((EditText) findViewById(R.id.sChapter)).getText().toString());
        intent.putExtra(MainActivity.VERSE_KEY, ((EditText) findViewById(R.id.sVerse)).getText().toString());
        startActivity(intent);
    }
}
