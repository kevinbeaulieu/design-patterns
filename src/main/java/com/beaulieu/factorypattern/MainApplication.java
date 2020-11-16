package com.beaulieu.factorypattern;

public class MainApplication {

    public static void main(String[] args) {
        IShape shapeOne = ShapeFactory.getShape(Shape.CIRCLE);

        if (shapeOne != null) {
            shapeOne.draw();
        }

        IShape shapeTwo = ShapeFactory.getShape(Shape.RECTANGLE);

        if (shapeTwo != null) {
            shapeTwo.draw();
        }

        IShape shapeThree = ShapeFactory.getShape(Shape.SQUARE);

        if (shapeThree != null) {
            shapeThree.draw();
        }
    }
}
