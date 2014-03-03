package com.jezzbel.main.tree;

/**
 * Created by Lucy on 21.02.14.
 */
public abstract class OperationNode extends Node {

    protected Node left;
    protected Node right;


    public void addLeft(Node left) {
        this.left = left;
    }

    public void addRight(Node right) {
        this.right = right;
    }
}
