package com.jezzbel.main.tree;

/**
 * Created by Lucy on 21.02.14.
 */
public class ValueNode extends Node {
    private double value;

    public ValueNode(double value) {
        this.value = value;
    }

    @Override
    double evaluate() {
        return this.value;
    }
}
