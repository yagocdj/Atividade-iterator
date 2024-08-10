package br.edu.ifpb.pps.colaborativaum.iterator;

// TODO - Colocar <T extends Comparable<T>> no diagrama UML
public interface BSTIterator<T extends Comparable<T>> {

    T getNext();
    boolean hasNext();
}
