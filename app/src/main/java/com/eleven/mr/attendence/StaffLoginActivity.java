package com.eleven.mr.attendence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class StaffLoginActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    private Button btnmrk, btnstaff;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_login);

        btnmrk = findViewById(R.id.btnmrk);
        btnstaff = findViewById(R.id.btnstaff);
        spinner = findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        List<String> employee = new ArrayList<String>();
        employee.add("emp id-01");
        employee.add("emp id-02");
        employee.add("emp id-03");
        employee.add("emp id-04");
        employee.add("emp id-05");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, employee);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        btnmrk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newint2 = new Intent(StaffLoginActivity.this, MainActivity.class);
                startActivity(newint2);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View v, int i, long l) {
        Toast.makeText(getApplicationContext(),
                spinner.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
