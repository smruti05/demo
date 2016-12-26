package com.assignmentondesignpattern.factorypattern;

import android.util.Log;

import com.assignmentondesignpattern.factorypattern.interfaces.Shape;

public class ShapeSquare implements Shape {
    @Override
    public String draw() {
        Log.i("ShapeSquare", "draw() method call");
        return "Square";
    }
}
