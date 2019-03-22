package com.mario.pdm_labo3_00046317;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mario.pdm_labo3_00046317.utils.AppConstant;

public class NewActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent mIntent = getIntent();
        mTextView = findViewById(R.id.tv_message);

        if (mIntent != null){
            mTextView.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
