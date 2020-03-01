public class Product {
    public int ID;
    public String name;
    public float price;

    public Product(int ID, String name, float price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString(){
        return "Sản phẩm " + this.name + " có giá là " + this.price;
    }
}
