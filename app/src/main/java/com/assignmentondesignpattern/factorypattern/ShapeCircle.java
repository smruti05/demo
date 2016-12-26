package com.assignmentondesignpattern.factorypattern;

import android.util.Log;
import com.assignmentondesignpattern.factorypattern.interfaces.Shape;

public class ShapeCircle implements Shape {
    @Override
    public String draw() {
        Log.i("ShapeCircle", "draw() method call");
        return "Circle";
    }
}
