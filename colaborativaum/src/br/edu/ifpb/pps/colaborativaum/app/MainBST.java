package br.edu.ifpb.pps.colaborativaum.app;

import br.edu.ifpb.pps.colaborativaum.tree.BinarySearchTree;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(8);
        System.out.println("Root:" + bst.getRoot());
        System.out.println("Size:" + bst.size());

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

        System.out.println("Iterando em ordem:");
        var iteratorInorder = bst.createInorderIterator();
        while (iteratorInorder.hasNext()) {
            var node = iteratorInorder.getNext();
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

        System.out.println("Iterando ordem em camada:");
        var iteratorLevelOrder = bst.createLevelorderIterator();
        while (iteratorLevelOrder.hasNext()) {
            var node = iteratorLevelOrder.getNext();
            System.out.print(node + " - ");
        }
        System.out.println("\n#######################################");

        BinarySearchTree<Integer> newBST = (BinarySearchTree<Integer>) bst.getClone();
        System.out.println("\n## Pré ordem na árvore clonada ##");
        newBST.preorder();

        // Removendo um nó da árvore clonada
        System.out.println("\n-X- Removendo o nó de valor '8' da árvore clonada -X-");
        newBST.delete(8);
        System.out.println(newBST.getRoot());

        System.out.println("\n## Pré ordem após remoção do 8 na árvore clonada ##");
        newBST.preorder();

        System.out.println("\n## Pré ordem na árvore original ##");
        bst.preorder();

        System.out.println("\nBuscando o 1 na árvore original: " + bst.search(1));
        System.out.println("Contém 1 na árvore original: " + bst.contains(1));

        System.out.println("Raíz da árvore original: " + bst.getRoot());

        System.out.println("Tamanho da árvore original: " + bst.size());
        System.out.println("Tamanho da árvore clonada: " + newBST.size());
    }
}
