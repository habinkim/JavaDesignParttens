package com.example.designpattern.abstractdocument.domain;

import java.util.Optional;

import com.example.designpattern.abstractdocument.Document;
import com.example.designpattern.abstractdocument.domain.enums.Property;

public interface HasModel extends Document {
    
    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(Property.MODEL.toString()));
    }
    
}
