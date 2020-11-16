package com.beaulieu.factorypattern.impl;

import com.beaulieu.factorypattern.IShape;
import org.apache.log4j.Logger;

public class Rectangle implements IShape {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    public String draw() {
        logger.info("rectangle");
        return "I'm a rectangle";
    }
}
