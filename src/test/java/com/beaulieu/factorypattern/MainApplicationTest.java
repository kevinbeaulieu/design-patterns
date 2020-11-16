package com.beaulieu.factorypattern;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainApplicationTest {

    @Test
    void isShapeFactoryReturningACircle() {
        Assert.assertEquals("I'm a circle", ShapeFactory.getShape(Shape.CIRCLE).draw());
    }

    @Test
    void isShapeFactoryReturningASquare() {
        Assert.assertEquals("I'm a square", ShapeFactory.getShape(Shape.SQUARE).draw());
    }

    @Test
    void isShapeFactoryReturningARectangle() {
        Assert.assertEquals("I'm a rectangle", ShapeFactory.getShape(Shape.RECTANGLE).draw());
    }
}