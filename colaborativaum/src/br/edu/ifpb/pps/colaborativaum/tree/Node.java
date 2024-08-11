package br.edu.ifpb.pps.colaborativaum.tree;

import br.edu.ifpb.pps.colaborativaum.prototype.Prototype;

/**
 * Classe Node com o parâmetro genérico T que estende Comparable<T>. Isso significa que
 * o tipo T deve ser comparável a si mesmo, permitindo que os nós sejam organizados de acordo
 * com os seus valores.
 *
 * @param <T>
 * @author Alex Sandro
 */
public class Node<T extends Comparable<T>> implements Prototype {

    public T value;
    public Node<T> left;
    public Node<T> right;

    Node(T value) {
        this.value = value;
        right = null;
        left = null;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public int compareTo(Node<T> otherNode) {
        // Provide implementation here
        // See effective java for appropriate implementation conditions
        return this.value.compareTo(otherNode.value);
    }

    @Override
    public Node<T> getClone() {
        Node<T> newNode = new Node<>(this.value);
        if (this.left != null) {
            newNode.left = this.left.getClone();
        }
        if (this.right != null) {
            newNode.right = this.right.getClone();
        }
        return newNode;
    }
}
