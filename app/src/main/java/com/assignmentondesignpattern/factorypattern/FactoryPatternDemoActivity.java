package com.assignmentondesignpattern.factorypattern;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.assignmentondesignpattern.R;
import com.assignmentondesignpattern.factorypattern.interfaces.Shape;
public class FactoryPatternDemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_pattern_demo);
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        ((TextView)findViewById(R.id.tvCircle)).setText(shapeCircle.draw());

        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        ((TextView)findViewById(R.id.tvRectangle)).setText(shapeRectangle.draw());

        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        ((TextView)findViewById(R.id.tvSquare)).setText(shapeSquare.draw());
    }
}
