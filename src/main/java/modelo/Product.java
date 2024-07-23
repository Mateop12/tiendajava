package modelo;

public class Product {

    private int idProduct;
    private String nameProduct;
    private double cost;
    private double price;
    private int quantity;
    private String description;
    private boolean state;

    public Product(){
        //constructor vacio
    }

    public Product(int idProduct, String nameProduct, double cost, double price, int quantity, String description, boolean state) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.state = state;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
