public class Main {
    public static void main(String[] args) {
        ManageProduct manageProduct = new ManageProduct();
        manageProduct.insertProduct(1,"Iphone",500);
        manageProduct.insertProduct(2,"Samsung",400);
        manageProduct.insertProduct(3,"Oppo",300);
        //manageProduct.displayListProduct();
        //manageProduct.searchProduct("Iphone");

        //manageProduct.removeProduct(1);
        //manageProduct.displayListProduct();

        //manageProduct.sortProduct();
        //manageProduct.displayListProduct();

        manageProduct.updateProduct(2,"Xiaomi",200);
        manageProduct.displayListProduct();
    }
}
