package com.example;

public class Symbols {

    public enum DataType {
        INT, BOOLEAN, STRING
    }

    public DataType type;
    public Object value;

    public Symbols(DataType type, Object value) {
        this.type = type;
        this.value = value;
    }
}
