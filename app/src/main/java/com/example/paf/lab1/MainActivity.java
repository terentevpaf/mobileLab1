package com.example.paf.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.content.Intent;
import android.os.*;
import java.lang.Thread;

public class MainActivity extends AppCompatActivity {
    private Handler uHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        uHandler = new Handler();
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.mainWV);
        webView.loadUrl("file:///android_asset/www/123.html");

        Thread t = new Thread()
        {
            public void run()
            {
                try
                {
                    Thread.sleep(3000);
                    Intent i=new Intent(MainActivity.this, FullscreenActivity.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}


