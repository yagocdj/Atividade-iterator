package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.Node;

import java.util.*;


public class PreorderIterator<T extends Comparable<T>> implements BSTIterator<T> {

    private final Deque<Node<T>> stack;

    public PreorderIterator(Node<T> root) {
        stack = new ArrayDeque<>();
        if (root != null) {
            stack.push(root);
        }
    }

    @Override
    public T getNext() {
        Node<T> node = stack.pop();
        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
        return node.value;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

}
