package com.assignmentondesignpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.assignmentondesignpattern.builderpattern.BuilderPatternDemoActivity;
import com.assignmentondesignpattern.factorypattern.FactoryPatternDemoActivity;
import com.assignmentondesignpattern.singletonpattern.SingletonPatternDemoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnFactoryPattern, btnBuilderPattern, btnSingletonPattern;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setOnClickListener();
    }
    private void initViews() {
        btnFactoryPattern = (Button) findViewById(R.id.btnFactoryPattern);
        btnBuilderPattern = (Button) findViewById(R.id.btnBuilderPattern);
        btnSingletonPattern = (Button) findViewById(R.id.btnSingletonPattern);
    }
    private void setOnClickListener() {
        btnFactoryPattern.setOnClickListener(this);
        btnBuilderPattern.setOnClickListener(this);
        btnSingletonPattern.setOnClickListener(this);
    }
    private void onClickOfAnyPattern(Class<?> className){
        Intent intentSelectedPattern = new Intent(this, className);
        startActivity(intentSelectedPattern);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFactoryPattern:
                onClickOfAnyPattern(FactoryPatternDemoActivity.class);
                break;
            case R.id.btnBuilderPattern:
                onClickOfAnyPattern(BuilderPatternDemoActivity.class);
                break;
            case R.id.btnSingletonPattern:
                onClickOfAnyPattern(SingletonPatternDemoActivity.class);
                break;
            default:
                Log.i("MainActivity", "Default case called");
                break;
        }
    }
}
