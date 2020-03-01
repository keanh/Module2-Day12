import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManageProduct extends Product{
        ArrayList<Product> listProduct = new ArrayList<>();

        public ArrayList<Product> getListProduct(){
            return listProduct;
        }

        public void insertProduct(int ID,String name,float price){
            Product newProduct = new Product(ID,name,price);
            listProduct.add(newProduct);
//            System.out.println("Thêm thành công");
        }

    public void removeProduct(int ID) {
        boolean isProduct = false;
        for (Product product:listProduct){
            if (product.getID() == ID){
                listProduct.remove(product);
                System.out.println("Đã xóa thành công");
                isProduct = true;
                break;
            }
        }

        if (!isProduct){
            System.out.println("Sản phẩm không tồn tại, thử lại.");
        }
    }

    public void searchProduct(String name) {
        boolean isProduct = false;
        for (Product product:listProduct){
            if (product.getName().equals(name)){
                System.out.println("Your phone: " + product.toString());
                isProduct = true;
                break;
            }
        }
        if (!isProduct){
            System.out.println("Không tìm thấy");
        }
    }

    public void updateProduct(int ID,String name,float price) {
        boolean isProduct = false;
        for (Product product:listProduct){
            if (product.getID() == ID){
                product.setName(name);
                product.setPrice(price);
                System.out.println("Thay đổi thành công");
                isProduct = true;
                break;
            }
        }
        if (!isProduct){
            System.out.println("Sản phẩm đã tồn tại");
        }
    }

    public void sortProduct() {
        Collections.sort(listProduct, new Comparator<Product>() {
            public int compare(Product product1, Product product2) {
                if (product1.getPrice() > product2.getPrice()){
                    return 1;
                }else if (product1.getPrice() == product2.getPrice()){
                    return 0;
                }else{
                    return -1;
                }
            }
        });
        System.out.println("Đã sắp xếp");
    }

    public void displayListProduct(){
        for (Product product:listProduct){
            System.out.println("Tên: " + product.getName() +", giá: " + product.getPrice());
        }
    }
}
