package bibles.englishbible.cebuanobible;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class verseActivity extends AppCompatActivity
        implements View.OnClickListener {
    TextView verseTextView;
    Button share,copy;
    ClipboardManager myClipboard;
    String verse ="God";
    SharedPreferences sharedpreferences,sharedPreferencesReadMode;
    public static final String SHARED_PREF_FONT_SIZE = "font_size";
    public static final float TEXT_FONT_SIZE = 20;
    public static final String TEXT_FONT_SIZE_VAR = "text_float_size";
    public static final String SHARED_PREF_NIGHT_DAY_MODE = "Night_Day_Mode";
    public static final String TEXT_COLOUR_VAR = "Text_Colour_Var";
    public static final String BACKROUND_COLOUR_VAR = "Background_Colour_Var";
    public static final int BLACK_COLOUR = Color.parseColor("#000000");
    public static final int WHITE_COLOUR = Color.parseColor("#f2f2f2");
    public static final String verseShare = "Today's Verse";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verse);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        verseTextView = ((TextView) findViewById(R.id.verse));
        Bundle localBundle = getIntent().getExtras();
        try {
            verse = localBundle.getString("verse");
            setTitle("Daily Verse");
            verseTextView.setText(verse);
            sharedpreferences = getSharedPreferences(SHARED_PREF_FONT_SIZE, Context.MODE_PRIVATE);
            sharedPreferencesReadMode = getSharedPreferences(SHARED_PREF_NIGHT_DAY_MODE, Context.MODE_PRIVATE);
            verseTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, sharedpreferences.getFloat(TEXT_FONT_SIZE_VAR,TEXT_FONT_SIZE));
            verseTextView.setBackgroundColor(sharedPreferencesReadMode.getInt(BACKROUND_COLOUR_VAR, WHITE_COLOUR));
            verseTextView.setTextColor(sharedPreferencesReadMode.getInt(TEXT_COLOUR_VAR, BLACK_COLOUR));
        } catch (Exception e) {

        }
        share = (Button) findViewById(R.id.share);
        copy = (Button) findViewById(R.id.copy);
        share.setOnClickListener(this);
        copy.setOnClickListener(this);
        // Back button starts
        if(getSupportActionBar()!= null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        // Back button ends
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.share:
                try {
                    Intent localIntent2 = new Intent("android.intent.action.SEND");
                    localIntent2.setType("text/plain");
                    localIntent2.putExtra("android.intent.extra.SUBJECT", "Today's Verse");
                    localIntent2.putExtra("android.intent.extra.TEXT", verse);
                    startActivity(Intent.createChooser(localIntent2, verseShare));
                } catch (Exception e) {

                }
                break;
            case R.id.copy:
                myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData copiedVerseClipData;
                copiedVerseClipData = ClipData.newPlainText("verse", verse);
                myClipboard.setPrimaryClip(copiedVerseClipData);
                Toast.makeText(verseActivity.this, "Verse Copied", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    // back option starts
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    // back option ends
}
