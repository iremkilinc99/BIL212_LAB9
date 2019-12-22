public class Driver {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(44, "ilk eleman");
        treeMap.put(17, "ikinci eleman");
        treeMap.put(15, "üçüncü eleman");
        treeMap.put(8, "dördüncü eleman");
        treeMap.put(16, "beşinci eleman");
        treeMap.put(32, "altıncı eleman");
        treeMap.put(89, "yedinci eleman");
        treeMap.put(86, "sekizinci eleman");
        treeMap.put(5, "dokuzuncu eleman");
        treeMap.put(9, "onuncu eleman");

        treeMap.print(treeMap.root());

        System.out.println();
        System.out.println("value: " + treeMap.get(44));
        System.out.println("value: " + treeMap.get(16));
        System.out.println("value: " + treeMap.get(56));
        System.out.println();

        System.out.println("root " + treeMap.root().getElement());
        System.out.println();
        //treeMap.print(treeMap.root());

        System.out.println("---------------------------------------------------");
        TreeMap.BalanceableBinaryTree balanceableBinaryTree = new TreeMap.BalanceableBinaryTree();

        if (((LinkedBinaryTree.Node) treeMap.root()).getRight() != null) {
            balanceableBinaryTree.rotateR(treeMap.root());
            System.out.println("right rotation");
            treeMap.print(balanceableBinaryTree.root());
        }
        //System.out.println("root after right rotation"+balanceableBinaryTree.root().getElement());
        System.out.println("-------------------------------------");
        treeMap.remove(8);


        if (((LinkedBinaryTree.Node) treeMap.root()).getLeft() != null && ((LinkedBinaryTree.Node) treeMap.root()).getLeft().getRight() != null) {
            balanceableBinaryTree.rotateLR(treeMap.root());
            System.out.println("left-right rotation");
            treeMap.print(balanceableBinaryTree.root());
        }
        System.out.println("-------------------------------------");
        treeMap.remove(15);


        if (((LinkedBinaryTree.Node) treeMap.root()).getRight() != null && ((LinkedBinaryTree.Node) treeMap.root()).getRight().getLeft() != null) {
            balanceableBinaryTree.rotateRL(treeMap.root());
            System.out.println("right left rotation");
            treeMap.print(balanceableBinaryTree.root());
            }
        }
    }
