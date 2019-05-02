package com.Alvin;

public class ShapeFactory {

    public Shape getShape(String ShapeType){
        if (ShapeType == null){
            return null;
        }

        if (ShapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        if (ShapeType.equalsIgnoreCase("Square")){
            return new Square();
        }

        if (ShapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
