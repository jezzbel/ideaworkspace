package com.jezzbel.main.tree;


public class ValueNode extends Node {
    private double value;

    /////
    public ValueNode(double value) {
        this.value = value;
    }

    @Override
    double evaluate() {
        return this.value;
    }
}
