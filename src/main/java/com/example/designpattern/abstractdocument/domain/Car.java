package com.example.designpattern.abstractdocument.domain;

import java.util.Map;

import com.example.designpattern.abstractdocument.AbstractDocument;

/**
 * Car
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

    public Car(Map<String, Object> properties) {
        super(properties);
    }
    
}