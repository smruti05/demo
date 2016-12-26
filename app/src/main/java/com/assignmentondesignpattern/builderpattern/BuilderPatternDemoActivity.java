package com.assignmentondesignpattern.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.assignmentondesignpattern.R;

public class BuilderPatternDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_pattern_demo);
        Cake vanilaCake = new Cake.CakeBuilder().sugar(1)
                                                .vanila(2)
                                                .cherry(3)
                                                .egg(1)
                                                .butter(0.7)
                                                .flour(10.5)
                                                .build();
        ((TextView)findViewById(R.id.tvBuilderText)).setText(vanilaCake.toString());
    }
}
