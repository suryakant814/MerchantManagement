package com.punit.merchant_management.model;

public class TestModel {
    String id;
    String name;

    public TestModel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {

        return "name = "+name+" id = "+id;
    }
}
