// Определим интерфейс VendingMachine, который будет содержать метод для
// получения продукта по его имени, объему и температуре:

public interface VendingMachine {
    HotDrink getProduct(int name, int volume, int temperature);
}
