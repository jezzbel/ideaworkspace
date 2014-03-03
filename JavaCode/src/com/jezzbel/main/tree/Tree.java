package com.jezzbel.main.tree;

/**
 * Created by Lucy on 21.02.14.
 */
public class Tree {

    Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public void evaluateTree() {
        System.out.print(root.evaluate());
    }

    public static void main(String args[]) {
        Tree tree = new Tree();
        OperationNode plus = new AddOperationNode();
        tree.setRoot(plus);
        plus.addLeft(new ValueNode(1.0));
        MultiplyOperationNode multiply = new MultiplyOperationNode();
        plus.addRight(multiply);
        multiply.addLeft(new ValueNode(2.0));
        multiply.addRight(new ValueNode(3.0));

        tree.evaluateTree();
    }
}
