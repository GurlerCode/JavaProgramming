package de.tum.cit.ase;

public class SealSaloon {
    private int totalOrders;
    private Meal[] orders;
    private static final Stock stock = new Stock();

    public SealSaloon() {
        this.orders = new Meal[0];
        this.totalOrders = 0;
    }

    // Calculate total price of a meal by summing prices of all required ingredients
    public static int calculateTotalPrice(Meal order) {
        int totalPrice = 0;
        for (String ingredient : order.getIngredients()) {
            StockIngredient stockIngredient = stock.findStockIngredient(ingredient);
            if (stockIngredient != null) {
                totalPrice += stockIngredient.getPrice();
            }
        }
        return totalPrice;
    }

    // Accepts a delivery of ingredients, adds new or updates existing stock items
    public static void acceptSupplyDelivery(String name, int price, int quantity) {
        StockIngredient ingredient = stock.findStockIngredient(name);
        if (ingredient != null) {
            ingredient.setQuantity(ingredient.getQuantity() + quantity);
        } else {
            // Create and add new ingredient if not already present
            StockIngredient newIngredient = new StockIngredient(name, price, quantity);
            stock.addToStockIngredients(newIngredient);
        }
    }

    // Place an order for a meal
    public void orderMeal(Meal meal) {
        this.orders = ArrayHelpers.addElementToArray(this.orders, meal);
        this.totalOrders++;
        checkOrderReady();
    }

    // Check and serve orders if ingredients are available
    public void checkOrderReady() {
        while (orders.length > 0) {
            Meal currentOrder = orders[0];
            boolean canPrepare = true;

            // Check if we have all required ingredients in stock
            for (String ingredient : currentOrder.getIngredients()) {
                if (stock.take(ingredient) == -1) {
                    canPrepare = false;
                    break;
                }
            }

            if (canPrepare) {
                System.out.println("The order is ready: " + currentOrder.getName());
                orders = ArrayHelpers.removeFirstElementFromArray(orders);
            } else {
                break;  // Exit if an order can't be served due to missing ingredients
            }
        }
    }

    // Calculate and print the number of remaining orders
    public void calculateRemainingOrderNumber() {
        int remainingOrders = orders.length;
        int count = 0;

        do {
            System.out.println("Order number: " + count);
            count++;
        } while (count <= remainingOrders);
    }

    // Getter for total orders
    public int getTotalOrders() {
        return totalOrders;
    }

    // Getter for orders
    public Meal[] getOrders() {
        return orders;
    }

    // Getter for stock
    public static Stock getStock() {
        return stock;
    }

}
