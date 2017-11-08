package com.example.opilane.speechprogram;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ImageButton mic;
    TextView resultText;
    TextToSpeech toSpeech;
    int result;
    EditText speakerText;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mic = (ImageButton)findViewById(R.id.micButton);
        resultText = (TextView)findViewById(R.id.resultText);
        speakerText = (EditText)findViewById(R.id.speakerText);

        toSpeech = new TextToSpeech(MainActivity,this, new.TextToSpeech.OnIntListener())
                @Override
                public void onInit(int status){
            if (status==TextToSpeech.SUCCESS){
                result = toSpeech.setLanguage(Locale.getDefault());
            }
            else
                {
                    Toast.makeText(getApplicationContext(), "Feature not supported on your device", Toast.LENGTH_SHORT).show();
                }

        });
    }
    

    public void micClick(View view) {
    }

    public void TTS(View view) {
    }

    public void Clear(View view) {
    }
}
