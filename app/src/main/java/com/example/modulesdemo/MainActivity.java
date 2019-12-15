package com.example.modulesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.net.DatagramPacket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BuildConfig.APP_NAME
    }

    /**
     * 获取Androidmanifest中的meta demo
     */
    private void getMetaDate() {
        TextView textView = findViewById(R.id.main_text);
        StringBuilder sb = new StringBuilder();
        sb.append(BuildConfig.CHANNEL + " : " + MetaUtils.getMeta(this, BuildConfig.CHANNEL) + " \n ");
        sb.append(BuildConfig.VERSION + " : " + MetaUtils.getMeta(this, BuildConfig.VERSION) + " \n ");
        textView.setText(sb.toString());
    }
}
