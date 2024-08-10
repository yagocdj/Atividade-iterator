package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.Node;

import java.util.Stack;

public class PostorderIterator<T extends Comparable<T>> implements BSTIterator<T> {
    private final Stack<Node<T>> stack = new Stack<>();

    public PostorderIterator(Node<T> root) {
        init(root);
    }

    private void init(Node<T> node) {
        while (node != null) {
            stack.push(node);
            if (node.left != null)
                node = node.left;
            else
                node = node.right;
        }
    }

    @Override
    public T getNext() {
        Node<T> node = stack.pop();
        if (hasNext()) {
            if (node == stack.peek().left) {
                init(stack.peek().right);
            }
        }
        return node.value;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
