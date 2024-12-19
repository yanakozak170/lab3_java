import java.util.*;

/**
 * Головний клас програми.
 */
public class Main {

    /**
     * Головний метод програми.
     * <p>
     * Створює масив літаків, сортує його за певними параметрами і виконує пошук заданого літака.
     * </p>
     *
     * @param args Аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        // Створення масиву літаків
        Airplane[] airplanes = {
                new Airplane("Boeing 747", 660, 988.0, 14815, 238840),
                new Airplane("Airbus A320", 180, 828.0, 6100, 24210),
                new Airplane("Cessna 172", 4, 226.0, 1289, 212),
                new Airplane("Concorde", 92, 2179.0, 7222, 119280),
                new Airplane("Antonov An-225", 250, 850.0, 15400, 300000),
                new Airplane("Gulfstream G650", 18, 904.0, 6100, 15870),
                new Airplane("Bombardier Global 7500", 19, 982.0, 6100, 17000)
        };

        // Сортування масиву за дальністю (зростання) і за місткістю (спадання)
        Arrays.sort(airplanes, Comparator.comparingInt(Airplane::getRange)
                .thenComparing((a1, a2) -> Integer.compare(a2.getCapacity(), a1.getCapacity())));

        // Виведення відсортованого масиву
        System.out.println("Відсортований масив літаків:\n");
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }

        // Пошук заданого літака
        Airplane targetAirplane = new Airplane("Airbus A320", 180, 828.0, 6100, 24210);
        int index = Arrays.asList(airplanes).indexOf(targetAirplane);

        if (index != -1) {
            System.out.println("\nЗнайдено літак: " + airplanes[index] + ", \nякий ідентичний до заданого: " + targetAirplane);
        } else {
            System.out.println("Літак не знайдено в масиві.");
        }
    }
}
