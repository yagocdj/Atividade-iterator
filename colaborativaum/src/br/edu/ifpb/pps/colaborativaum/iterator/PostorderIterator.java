package br.edu.ifpb.pps.colaborativaum.iterator;

import br.edu.ifpb.pps.colaborativaum.tree.BinarySearchTree;
import br.edu.ifpb.pps.colaborativaum.tree.Node;
import java.util.Stack;


public class PostorderIterator<T extends Comparable<T>> implements BSTIterator<T> {
    private BinarySearchTree<T> bst;
    private Node<T> currentNode;

    public PostorderIterator(BinarySearchTree<T> bst){
        this.bst = bst;
    }

    @Override
    public Node<T> getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return currentNode.left != n || currentNode.right;
    }

    Node<T> postOrderIterative(Node<T> node)
    {
        Stack<Node> stack = new Stack<Node<T>>();

        // Check for empty tree
        if (node == null)
            return list;

        stack.push(node);

        Node prev = null;
        while (!stack.isEmpty()) {
            Node current = stack.peek();

            /* go down the tree in search of a leaf an if so
            process it and pop stack otherwise move down */
            if (prev == null || prev.left == current || prev.right == current) {
                if (current.left != null)
                    stack.push(current.left);
                else if (current.right != null)
                    stack.push(current.right);
                else {
                    stack.pop();
                    list.add(current.data);
                }

                /* go up the tree from left node, if the
                child is right push it onto stack otherwise
                process parent and pop stack */
            }
            else if (current.left == prev) {
                if (current.right != null)
                    stack.push(current.right);
                else {
                    stack.pop();
                    list.add(current.data);
                }

                /* go up the tree from right node and after
                coming back from right node process parent
                and pop stack */
            }
            else if (current.right == prev) {
                stack.pop();
                list.add(current.data);
            }

            prev = current;
        }

        return list;
    }
}
