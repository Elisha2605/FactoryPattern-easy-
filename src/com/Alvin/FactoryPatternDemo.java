package com.Alvin;

import java.awt.*;
import java.util.Scanner;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        Scanner shapeInput = new Scanner(System.in);

        ShapeFactory shapeFactory = new ShapeFactory();

        System.out.println("What Shape do you want?");

        Boolean run = true;
        while (run.equals(true)) {

            if (shapeInput.hasNextLine()) {

                String typeOfShape = shapeInput.nextLine();

                Shape shape1 = shapeFactory.getShape(typeOfShape);

                shape1.draw();

            }
        }


        //get an object of Circle and call its draw method.
       /* Shape shape1 = shapeFactory.getShape("circle");

        //call draw method of Circle
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");

        shape3.draw();*/
    }
}
