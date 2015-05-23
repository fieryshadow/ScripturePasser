package edu.byui.shane.scripturepasser;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public static final String EXTRA_KEY = "com.byui.shane.MainActivityExtraKey";

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
        EditText book = (EditText) findViewById(R.id.sBook);
        EditText chapter = (EditText) findViewById(R.id.sChapter);
        EditText verse = (EditText) findViewById(R.id.sVerse);
        String message = book.getText().toString() + " " + chapter.getText().toString() + ":" + verse.getText().toString();
        intent.putExtra(MainActivity.EXTRA_KEY, message);
        //intent.putExtra("book", editText.getText().toString());
        //editText = (EditText) findViewById(R.id.sChapter);
        //intent.putExtra("chapter", editText.getText().toString());
        //editText = (EditText) findViewById(R.id.sVerse);
        //intent.putExtra("verse", editText.getText().toString());
        startActivity(intent);
    }
}
