package com.example.kevinbui.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.example.kevinbui.quicklauncher.SOMETHING")) {
            TextView tv = (TextView)findViewById(R.id.textView);
            // Find the key and store as text
            String text = getIntent().getExtras().getString("com.example.kevinbui.quicklauncher.SOMETHING");
            tv.setText(text);

        }
    }
}
