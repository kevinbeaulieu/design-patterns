package com.beaulieu.factorypattern;

import com.beaulieu.factorypattern.impl.Circle;
import com.beaulieu.factorypattern.impl.Rectangle;
import com.beaulieu.factorypattern.impl.Square;

public class ShapeFactory {

    private ShapeFactory() {
    }

    public static IShape getShape(Shape shape) {
        switch (shape) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
