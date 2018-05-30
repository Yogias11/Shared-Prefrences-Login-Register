package com.example.newbie.sharedprefloginregis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView txUser = findViewById(R.id.tvUser);
        Button btnLogout = findViewById(R.id.btnLogout);

        if(getIntent().getExtras() != null) {
            txUser.setText(getIntent().getStringExtra("username"));
        } else {
            txUser.setText("not found");
        }

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
