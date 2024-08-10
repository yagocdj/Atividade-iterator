package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.Node;

import java.util.Stack;


public class PreorderIterator<T extends Comparable<T>> implements BSTIterator<T> {

    private Node<T> currentNode;
    private Stack<Node<T>> nodeStack;

    public PreorderIterator(Node<T> root) {
        this.currentNode = root;
    }

    @Override
    public Node<T> getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public void iterativePreorder(Node<T> node) {

        // Base case
        if (node == null) return;

        // Create an empty stack and push root to it
        // Stack<Node<T>> nodeStack = new Stack<Node<T>>();
        nodeStack.push(currentNode);  // currentNode starts at root

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (!nodeStack.empty()) {

            // Pop the top item from stack and print it
            Node<T> currentNode = nodeStack.peek();  // gets the element without removing it
            System.out.print(currentNode.value + " ");
            // nodeStack.pop();  // removes the element from the stack

            // Push right and left children of the popped node to stack
            if (currentNode.right != null) {
                nodeStack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                nodeStack.push(currentNode.left);
            }
        }
    }
}
