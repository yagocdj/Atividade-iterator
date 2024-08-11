package br.edu.ifpb.pps.colaborativaum.tree;

import br.edu.ifpb.pps.colaborativaum.iterator.BSTIterator;

public interface IterableBST<T extends Comparable<T>> {

    BSTIterator<T> createPreorderIterator();
    BSTIterator<T> createInorderIterator();
    BSTIterator<T> createPostorderIterator();

    BSTIterator<T> createLevelorderIterator();
}
