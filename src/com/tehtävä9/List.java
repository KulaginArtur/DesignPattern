package com.tehtävä9;

import java.util.ArrayList;

public class List {

    public ListConverter converter;

    public String convert(ArrayList arrayList) {
        return converter.convert(arrayList);
    }

    public void setConverter(ListConverter newConverter){
        converter = newConverter;
    }

    public List(){
        converter = new afterOne();
    }
}
