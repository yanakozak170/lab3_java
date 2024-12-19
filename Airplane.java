import java.util.*;

/**
 * Клас для опису літака.
 */
class Airplane {
    private String model; // Модель літака
    private int capacity; // Місткість літака
    private double maxSpeed; // Максимальна швидкість
    private int range; // Дальність польоту
    private int fuelCapacity; // Місткість паливного бака

    /**
     * Конструктор для створення об'єкта літака.
     *
     * @param model Модель літака.
     * @param capacity Місткість літака (кількість пасажирів).
     * @param maxSpeed Максимальна швидкість літака.
     * @param range Дальність польоту (в кілометрах).
     * @param fuelCapacity Місткість паливного бака (в літрах).
     */
    public Airplane(String model, int capacity, double maxSpeed, int range, int fuelCapacity) {
        this.model = model;
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * Отримати модель літака.
     *
     * @return Модель літака.
     */
    public String getModel() {
        return model;
    }

    /**
     * Отримати місткість літака.
     *
     * @return Місткість літака (кількість пасажирів).
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Отримати максимальну швидкість літака.
     *
     * @return Максимальна швидкість літака (в км/год).
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Отримати дальність польоту літака.
     *
     * @return Дальність польоту (в кілометрах).
     */
    public int getRange() {
        return range;
    }

    /**
     * Отримати місткість паливного бака літака.
     *
     * @return Місткість паливного бака (в літрах).
     */
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * Повертає текстове представлення об'єкта літака.
     *
     * @return Текстове представлення літака.
     */
    @Override
    public String toString() {
        return String.format("Model: %s, Capacity: %d, MaxSpeed: %.2f, Range: %d, FuelCapacity: %d",
                model, capacity, maxSpeed, range, fuelCapacity);
    }

    /**
     * Порівняння двох об'єктів літаків на рівність.
     *
     * @param obj Об'єкт для порівняння.
     * @return true, якщо об'єкти рівні; false, якщо ні.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Airplane airplane = (Airplane) obj;
        return capacity == airplane.capacity &&
                Double.compare(airplane.maxSpeed, maxSpeed) == 0 &&
                range == airplane.range &&
                fuelCapacity == airplane.fuelCapacity &&
                Objects.equals(model, airplane.model);
    }

    /**
     * Генерує хеш-код для об'єкта літака.
     *
     * @return Хеш-код об'єкта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(model, capacity, maxSpeed, range, fuelCapacity);
    }
}