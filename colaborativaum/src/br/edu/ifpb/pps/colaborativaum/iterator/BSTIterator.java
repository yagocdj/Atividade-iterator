package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.Node;

// TODO - Colocar <T extends Comparable<T>> no diagrama UML
public interface BSTIterator<T extends Comparable<T>> {

    Node<T> getNext();
    boolean hasNext();
}
