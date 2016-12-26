package com.assignmentondesignpattern.factorypattern;

import com.assignmentondesignpattern.factorypattern.interfaces.Shape;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new ShapeCircle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new ShapeRectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new ShapeSquare();
        }
        return null;
    }
}
