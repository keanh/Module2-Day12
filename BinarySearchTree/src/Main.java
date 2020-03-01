public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.postOrder();
        
        System.out.println();
        System.out.println("Sắp xếp kiểu preOrder:");
        tree.preOrder();

        System.out.println();
        System.out.println("Sau khi xóa 50:");
        tree.deleteKey(50);
        tree.postOrder();

        System.out.println();
        System.out.println("Search");
        tree.search(70);
        tree.postOrder();

    }
}
