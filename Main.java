public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrinkWithTemperature("Tea", 200, 80);
        HotDrink coffee = new HotDrinkWithTemperature("Coffee", 250, 90);
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        HotDrink teaFromMachine = vendingMachine.getProduct(1, 200, 80);
        HotDrink coffeeFromMachine = vendingMachine.getProduct(2, 250, 90);
        System.out.println(tea.toString());
        System.out.println(coffee.toString());
        System.out.println(teaFromMachine.toString());
        System.out.println(coffeeFromMachine.toString());
    }
}
