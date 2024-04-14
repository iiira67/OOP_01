//Cоздадим класс HotDrinksVendingMachine, который реализует интерфейс VendingMachine и имеет логику выдачи продукта:

public class HotDrinksVendingMachine implements VendingMachine {
    @Override
    public HotDrink getProduct(int name, int volume, int temperature) {
        if (name == 1) {
            return new HotDrinkWithTemperature("Tea", volume, temperature);
        } else if (name == 2) {
            return new HotDrinkWithTemperature("Coffee", volume, temperature);
        } else {
            return null; 
        }
    }
}
