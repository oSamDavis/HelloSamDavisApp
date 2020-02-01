package com.example.hellosamdavis;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //int i = 0;
    //int j = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("SamDavis", "Button Clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.other));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("SamDavis", "rootView Color Changed");
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.silver));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text the user inputted
                String s = ((EditText) findViewById(R.id.editText)).getText().toString();
                //put the text into our text view once the 'change text' button is clicked
                if(TextUtils.isEmpty(s)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello from SamDavis");
                }else{
                    ((TextView) findViewById(R.id.textView)).setText(s);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                //reset the background color to colorAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimary));
                //reset the text back to "Hello from SamDavis"
                ((TextView) findViewById(R.id.textView)).setText("Hello from SamDavis!");
            }
        });
    }
}
