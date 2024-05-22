import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;  

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        if (items.isEmpty()) {
            System.out.println("The shopping cart is empty.");
            return;
        }
        List<Item> itemsCopy = new ArrayList<>();

        for (Item item : this.items) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemsCopy.add(item);
            }
        }
        items.removeAll(itemsCopy);
    }

    public double calculateTotalValue() {
        if (items.isEmpty()) {
            throw new RuntimeException("The shopping cart is empty!");
        }
        
        double total = 0;
       
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        
        return total;
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The shopping cart is empty.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}
