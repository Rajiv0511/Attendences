package com.eleven.mr.attendence;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnmrk, btnstaff, btnlog;
    private EditText empcode, password;

    private String url = "http://dowhile.in/Attendance/api_get_employee.php";
    private String success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmrk = findViewById(R.id.btnmrk);
        btnstaff = findViewById(R.id.btnstaff);
        btnlog = findViewById(R.id.btnlog);
        empcode = findViewById(R.id.empcode);
        password = findViewById(R.id.password);

        btnstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newint = new Intent(MainActivity.this, StaffLoginActivity.class);
                startActivity(newint);
            }
        });

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}