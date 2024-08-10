package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.BinarySearchTree;
import br.edu.ifpb.pps.colaborativaum.tree.Node;

import java.util.Stack;


public class PreorderIterator<T extends Comparable<T>> implements BSTIterator<T> {

    private BinarySearchTree<T> bst;
    private Node<T> currentNode;

    public PreorderIterator(BinarySearchTree<T> bst) {
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

    private void iterativePreorder(Node<T> node) {

        // Base case
        if (node == null) return;

        // Create an empty stack and push root to it
        Stack<Node<T>> nodeStack = new Stack<Node<T>>();
        nodeStack.push(currentNode);  // currentNode starts at root

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (!nodeStack.empty()) {

            // Pop the top item from stack and print it
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }
}
