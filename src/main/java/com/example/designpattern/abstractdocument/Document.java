package com.example.designpattern.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Document {

    /**
    * @author : 김하빈(hbkim@bpnsolution.com)
    * * @description : 
    * @param key
    * @param value
    * @return Void
    * @Date : 2021. 01. 07
    * @Time : 10:02:29
    */
    Void put (String key, Object value);

    /**
    * @author : 김하빈(hbkim@bpnsolution.com)
    * * @description : 
    * @param key
    * @return Object
    * @Date : 2021. 01. 07
    * @Time : 10:04:13
    */
    Object get(String key);

    /**
    * @author : 김하빈(hbkim@bpnsolution.com)
    * * @description : 
    * @param key
    * @param constructor
    * @return child documents
    * @Date : 2021. 01. 07
    * @Time : 10:05:10
    */
    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);

}