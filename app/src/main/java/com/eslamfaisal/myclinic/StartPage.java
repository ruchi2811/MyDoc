package com.eslamfaisal.myclinic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.eslamfaisal.myclinic.data.DentalDbHelper;

public class StartPage extends AppCompatActivity {

    DentalDbHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        dbHelper = new DentalDbHelper(this);
    }

    public void performSignIn(View view) {
        EditText userID = (EditText) findViewById(R.id.loginemail);
        EditText password = (EditText) findViewById(R.id.loginpassword);
        if(userID.getText().toString().isEmpty()) {
            userID.setError("Please enter your ID");
            return;
        }
        if(password.getText().toString().isEmpty()) {
            password.setError("Please enter your password");
            return;
        }


        /* Dummy Sign-in procedure - Used only for development purposes
         *
         * Signs in the user if: id = owner; password = owner123
         *
         * */

        if(userID.getText().toString().trim().equals("doctor")) {
            if(password.getText().toString().trim().equals("doctor123")) {
                Toast.makeText(this, "Successfully logged in", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, MainActivity.class));
                finish();
            } else {
                password.setError("Incorrect password");
            }
        } else {
            userID.setError("Incorrect ID");
        }
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
