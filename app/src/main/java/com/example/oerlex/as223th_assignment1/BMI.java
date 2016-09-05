package com.example.oerlex.as223th_assignment1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.oerlex.as223th_assignment1.countryList.CountryList;
import com.example.oerlex.as223th_assignment1.weather.VaxjoWeather;

public class BMI extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    EditText weightText;
    EditText heigthText;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_main);

        weightText = (EditText)findViewById(R.id.weightfield);
        heigthText = (EditText)findViewById(R.id.heightField);
        resultText = (TextView)findViewById(R.id.result);
    }

    public void calculate(View view) {
        String weight = weightText.getText().toString();
        String height = heigthText.getText().toString();

        if(weight.matches("") || height.matches("")){
            Toast.makeText(this,"Please fill out the form",Toast.LENGTH_SHORT).show();
        }else {
            double weightDouble = Double.parseDouble(weight);
            double heightDouble = Double.parseDouble(height) / 100;
            System.out.println("Weight: " + weightDouble);
            System.out.println("Height: " + heightDouble);

            double s = Math.round((weightDouble / (heightDouble * heightDouble) * 100));
            s = s / 100;

            resultText.setText(String.valueOf(s));
        }
    }

    public void reset(View view){
        weightText.setText("");
        heigthText.setText("");
        resultText.setText("");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.random_number, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_random) {
            Intent intent = new Intent(this,RandomNumber.class);
            this.startActivityForResult(intent,1);
        } else if (id == R.id.nav_bmi) {
            Intent intent = new Intent(this,BMI.class);
            this.startActivityForResult(intent,1);
        } else if (id == R.id.nav_countryList) {
            Intent intent = new Intent(this,CountryList.class);
            this.startActivityForResult(intent,1);
        } else if (id == R.id.nav_weather) {
            Intent intent = new Intent(this,VaxjoWeather.class);
            this.startActivityForResult(intent,1);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
