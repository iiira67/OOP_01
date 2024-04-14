// Затем создадим класс HotDrinkWithTemperature, наследующийся от класса
// HotDrink и добавляющий поле temperature:

public class HotDrinkWithTemperature extends HotDrink {
    private int temperature;
    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrinkWithTemperature{" +
                "name='" + getName() + "'" +
                ", volume=" + getVolume() +
                ", temperature=" + temperature +
                '}';
    }
}
