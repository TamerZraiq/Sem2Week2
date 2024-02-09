package ie.atu;
import java.util.ArrayList;
public class OnlineOrderingSystem {
    public static void main(String[] args) {
        ArrayList<MenuItem> orderItems = new ArrayList<>();
        orderItems.add(new Burger("Cheeseburger", 8.99, "Beef patty with cheese"));
        orderItems.add(new Pizza("Margherita", 12.99, "Pizza with tomato and mozzarella"));
        orderItems.add(new Salad("Caesar Salad", 6.99, "Fresh lettuce with Caesar dressing"));
        orderItems.add(new Dessert("Chocolate Cake", 4.99, "Rich, dense chocolate cake"));


        for (MenuItem menuItem : orderItems) {
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Description: " + menuItem.getDescription());
            System.out.println("Price: $" + menuItem.getPrice());
            System.out.println();
        }
        double totalCost = 0;
        for(MenuItem menuItem : orderItems){
            totalCost += menuItem.getPrice();
        }
        System.out.println("Total Cost : $" + totalCost);
    }
}
