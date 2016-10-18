package com.example.rofiq.app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by rofiq on 10/18/2016.
 */

public class splashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spash_screen);

        // tunggu();
    }

    public void beginClicked(View v) {
        show();
    }

    public void aboutClicked(View v) {

    }

    public void tunggu() {
        Thread thread = new Thread() {

            @Override
            public void run() {
                try {
                    while (true) {
                        sleep(1500);
                        show();
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    public void show() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}
