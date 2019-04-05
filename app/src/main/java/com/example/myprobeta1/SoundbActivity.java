package com.example.myprobeta1;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SoundbActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6,sound7,sound8,sound9,sound10,sound11,sound12,sound13,sound14,sound15;
    private int sound3StreamId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundb);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(9)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundPool.load(this, R.raw.rooster, 1);
        sound2 = soundPool.load(this, R.raw.dundun, 1);
        sound3 = soundPool.load(this, R.raw.drama, 1);
        sound4 = soundPool.load(this, R.raw.minecraftdeath, 1);
        sound5 = soundPool.load(this, R.raw.nope, 1);
        sound6 = soundPool.load(this, R.raw.meaw, 1);
        sound7 = soundPool.load(this, R.raw.cow, 1);
        sound8 = soundPool.load(this, R.raw.crow, 1);
        sound9 = soundPool.load(this, R.raw.goat, 1);

    }

    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button_sound1:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound3:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound7:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound8:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound9:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
}
