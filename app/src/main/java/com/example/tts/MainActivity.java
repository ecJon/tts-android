package com.example.tts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtText = (EditText) findViewById(R.id.et_text);

    }

    /**
     * 开始合成
     *
     * @param view
     */
    public void start(View view) {
        Toast.makeText(this, "开始合成 : " + mEtText.getText().toString().trim(), Toast.LENGTH_SHORT).show();
        TextToSpeechCNUtil.playTextSpeech(this, mEtText.getText().toString().trim());
//        TextToSpeechCNUtil.playTextSpeech(this, "你正在干什么?What's the weather like today?");
    }
}