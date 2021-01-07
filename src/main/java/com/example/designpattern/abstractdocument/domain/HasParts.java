package com.example.designpattern.abstractdocument.domain;

import java.util.stream.Stream;

import com.example.designpattern.abstractdocument.Document;
import com.example.designpattern.abstractdocument.domain.enums.Property;

public interface HasParts extends Document {

    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
    
}
