package com.eslamfaisal.myclinic;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.eslamfaisal.myclinic.data.DentalDbHelper;
import com.eslamfaisal.myclinic.data.InputValidation;
import com.eslamfaisal.myclinic.data.RegisterData;

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

       if(userID.getText().toString().trim().equals("admin")) {
          if(password.getText().toString().trim().equals("admin123")) {
                //Toast.makeText(this, "Successfully logged in", Toast.LENGTH_SHORT).show();
               startActivity(new Intent(this, UsersList.class));

               finish();
           } else {
               password.setError("Incorrect password");
           }
       } else {
           userID.setError("Incorrect ID");
       }
    }

    public void DoctorLogin(View view) {
        startActivity(new Intent(this, login_page.class));

    }
    public void AdminLogin(View view) {
        startActivity(new Intent(this, UsersList.class));

    }
    public void InfoActivity(View view) {
        startActivity(new Intent(this, info.class));

    }



}
