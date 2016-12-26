package com.assignmentondesignpattern.singletonpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.assignmentondesignpattern.R;

public class SingletonPatternDemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_activity_demo);
        SingletonInstance instance = SingletonInstance.getInstance();
        ((TextView)findViewById(R.id.tvMessage)).setText(instance.showMessage());
    }
}
