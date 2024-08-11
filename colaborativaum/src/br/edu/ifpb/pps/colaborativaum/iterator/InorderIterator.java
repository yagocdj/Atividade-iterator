package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.Node;

import java.util.Stack;

public class InorderIterator<T extends Comparable<T>> implements BSTIterator<T> {

    private final Stack<Node<T>> stack = new Stack<>();

    public InorderIterator(Node<T> root) {
        pushAll(root);
    }

    @Override
    public T getNext() {
        Node<T> node = stack.pop();
        pushAll(node.right);
        return node.value;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushAll(Node<T> node) {
        while (node != null){
            stack.push(node);
            node = node.left;
        }
    }
}
