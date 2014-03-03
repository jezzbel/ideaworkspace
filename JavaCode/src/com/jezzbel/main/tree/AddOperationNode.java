package com.jezzbel.main.tree;

/**
 * Created by Lucy on 21.02.14.
 */
public class AddOperationNode extends OperationNode {
    @Override
    double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
