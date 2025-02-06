public class TShirt {
    private int shirtID;
    private String description;
    private char size;
    private double price;
    private int quantityInStock;

    public void displayInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Description: " + description);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void addStock(int quantity) {
        quantityInStock += quantity;
    }

    public TShirt(int shirtID, String description, char size, double price, int quantityInStock) {
        this.shirtID = shirtID;
        this.description = description;
        this.size = size;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
}
