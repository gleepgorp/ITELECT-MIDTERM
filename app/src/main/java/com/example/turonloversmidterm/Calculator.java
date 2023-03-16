package com.example.turonloversmidterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator extends AppCompatActivity {

    TextView workingsTV;
    TextView resultsTV;

    String workings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        initTextViews();
    }

    public void clearOnClick(View view) {
        workingsTV.setText("");
        workings = "";
        resultsTV.setText("");
    }

    public void parenthesesOnClick(View view) {
    }

    public void circumflexOnClick(View view) {
    }

    public void sevenOnClick(View view) {
    }

    public void eightOnClick(View view) {
    }

    public void nineOnClick(View view) {
    }

    public void multiplyOnClick(View view) {
    }

    public void fourOnClick(View view) {
    }

    public void fiveOnClick(View view) {
    }

    public void sixOnClick(View view) {
    }

    public void subtractOnClick(View view) {
    }

    public void oneOnClick(View view) {
    }

    public void twoOnClick(View view) {
    }

    public void threeOnClick(View view) {
    }

    public void additionOnClick(View view) {
    }

    public void pointOnClick(View view) {
    }

    public void zeroOnClick(View view) {
    }

    public void equalsOnClick(View view) {
    }
}