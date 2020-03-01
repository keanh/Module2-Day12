public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root = null;
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }


    /* Hàm đệ qui để xóa phần tử khỏi mảng */
    public Node deleteRec(Node root, int key)
    {
        /* trường hợp gốc : nếu node root null */
        if (root == null)  return root;

        /* ngược lại chúng ta sẽ duyệt dọc cây  */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);

            // nếu key có cùng giá trị với node key thì chính là node cần xóa
        else
        {
            // node không có hoặc chỉ có 1 node con
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node có 2 node con.
            root.key = minValue(root.right);

            // Xóa phần từ nhỏ nhất bên phải
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root)
    {
        int min = root.key;
        while (root.left != null)
        {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    public Node search(Node root, int key)
    {
        // Trường hợp gốc : nếu node null hoặc là node root
        if (root==null || root.key==key)
            return root;

        // gia trị lớn hơn giá trị code node root
        if (root.key > key)
            return search(root.left, key);

        // giá trị bé hơn giá trị của node root
        return search(root.right, key);
    }

    public void postOrderRec(Node root){
        if (root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public void preOrderRec(Node root){
        if (root != null){
            System.out.print(root.key + " ");
            postOrderRec(root.left);
            postOrderRec(root.right);
        }
    }

    public void insert(int key) {
        root = insertRec(root,key);
    }

    public void postOrder() {
        postOrderRec(root);
    }
    void deleteKey(int key)
    {
        root = deleteRec(root, key);
    }


    public void search(int key) {
        root = search(root,key);
    }

    public void preOrder(){
        preOrderRec(root);
    }
}
