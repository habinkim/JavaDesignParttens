package com.example.designpattern.abstractdocument.domain;

import java.util.Optional;

import com.example.designpattern.abstractdocument.Document;
import com.example.designpattern.abstractdocument.domain.enums.Property;

public interface HasType extends Document {

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
    
}
