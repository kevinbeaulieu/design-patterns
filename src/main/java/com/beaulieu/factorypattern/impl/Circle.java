package com.beaulieu.factorypattern.impl;

import com.beaulieu.factorypattern.IShape;
import org.apache.log4j.Logger;

public class Circle implements IShape {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    public String draw() {
        logger.info("circle");
        return "I'm a circle";
    }
}