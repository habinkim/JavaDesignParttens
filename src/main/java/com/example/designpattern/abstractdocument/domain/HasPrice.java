package com.example.designpattern.abstractdocument.domain;

import java.util.Optional;

import com.example.designpattern.abstractdocument.Document;
import com.example.designpattern.abstractdocument.domain.enums.Property;

public interface HasPrice extends Document {

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE.toString()));
    }

}
