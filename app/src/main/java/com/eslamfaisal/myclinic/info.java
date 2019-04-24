package com.eslamfaisal.myclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void StartMainActivity(View view) {
        startActivity(new Intent(this, MainActivity.class));

    }
    public void LoginStartActivity(View view) {
        startActivity(new Intent(this, StartPage.class));

    }
    public void InfoActivity(View view) {
        startActivity(new Intent(this, info.class));

    }

}
