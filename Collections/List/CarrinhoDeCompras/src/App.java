public class App {
    public static void main(String[] args) {
        ShoppingCart carrinhoDeCompras = new ShoppingCart();

        carrinhoDeCompras.addItem("Item 1", 10, 1);
        carrinhoDeCompras.addItem("Item 2", 50, 5);
        carrinhoDeCompras.addItem("Item 3", 2.5, 2);
        carrinhoDeCompras.addItem("Item 3", 2.5, 2);

        carrinhoDeCompras.displayItems();

        System.out.println(carrinhoDeCompras.calculateTotalValue());
       

        //carrinhoDeCompras.removerItem("Item 1");
        
        carrinhoDeCompras.displayItems();

        
        System.out.println(carrinhoDeCompras.calculateTotalValue());
    }
}
