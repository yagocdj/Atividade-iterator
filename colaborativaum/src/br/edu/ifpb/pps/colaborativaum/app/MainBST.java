package br.edu.ifpb.pps.colaborativaum.app;

import br.edu.ifpb.pps.colaborativaum.tree.BinarySearchTree;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(8);
        System.out.println("Root:" + bst.getRoot());
        System.out.println("Size:" + bst.size());

        //System.out.println("Delete 8:" + bst.delete(8));
        //System.out.println("Root:" + bst.getRoot());
        bst.add(3);
        bst.add(1);
        bst.add(6);
        bst.add(4);
        bst.add(7);
        bst.add(10);
        bst.add(14);
        bst.add(13);
        bst.preorder();
        bst.inorder();
        bst.postorder();

        System.out.println("\n#######################################");
        System.out.println("Iterando pré ordem:");
        var iteratorPreorder = bst.createPreorderIterator();
        while (iteratorPreorder.hasNext()) {
            var node = iteratorPreorder.getNext();
            System.out.print(node + " - ");
        }
        System.out.println("\n#######################################");

        System.out.println("Iterando pós ordem:");
        var iteratorPostOrder = bst.createPostorderIterator();
        while (iteratorPostOrder.hasNext()) {
            var node = iteratorPostOrder.getNext();
            System.out.print(node + " - ");
        }
        System.out.println("\n#######################################");

//        System.out.println("Search 90: " + bst.search(810));
//        System.out.println("Contains 80: " + bst.contains(810));
//
//        System.out.println("Delete 50:" + bst.delete(50));
//        System.out.println("Root:" + bst.getRoot());
//
//        System.out.println("Size:" + bst.size());
    }
}
