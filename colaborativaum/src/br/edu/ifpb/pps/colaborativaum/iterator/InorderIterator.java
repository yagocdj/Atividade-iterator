package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.BinarySearchTree;
import br.edu.ifpb.pps.colaborativaum.tree.Node;

public class InorderIterator<T extends Comparable<T>> implements BSTIterator<T> {

    private BinarySearchTree<T> bst;
    private Node<T> currentNode;

    public InorderIterator(BinarySearchTree<T> bst) {
        this.bst = bst;
    }

    @Override
    public Node<T> getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
