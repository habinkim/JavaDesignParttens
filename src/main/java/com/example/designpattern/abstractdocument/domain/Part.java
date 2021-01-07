package com.example.designpattern.abstractdocument.domain;

import java.util.Map;

import com.example.designpattern.abstractdocument.AbstractDocument;

public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

    public Part(Map<String, Object> properties) {
        super(properties);
    }
    
}
