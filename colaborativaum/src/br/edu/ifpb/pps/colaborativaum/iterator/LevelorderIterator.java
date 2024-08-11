package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.Node;

import java.util.LinkedList;
import java.util.*;

public class LevelorderIterator<T extends Comparable<T>> implements BSTIterator<T> {
    private final Queue<Node<T>> queue = new LinkedList<>();

    public LevelorderIterator(Node<T> root) {
        if (root != null) {
            queue.add(root);
        }
    }

    @Override
    public T getNext() {
        Node<T> node = queue.poll();
        assert node != null;
        if (node.left != null) {
            queue.add(node.left);
        }
        if (node.right != null) {
            queue.add(node.right);
        }
        return node.value;
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
