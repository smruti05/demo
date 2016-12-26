package com.assignmentondesignpattern.factorypattern;

import android.util.Log;

import com.assignmentondesignpattern.factorypattern.interfaces.Shape;

public class ShapeRectangle implements Shape {
    @Override
    public String draw() {
        Log.i("ShapeRectangle", "draw() method call");
        return "Rectangle";
    }
}
