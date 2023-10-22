import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;

/*
Этот пример демонстрирует создание
и использование лямбда-выражений.
 */

public class VirtualInterfacesExample {

    public static void main(String[] args) {
        // Реализация функционального интерфейса
        Function<String, Integer> silhouetteToSize = silhouette -> silhouette.length();

        // Реализация BinaryOperator
        BinaryOperator<String> stringAdder = (str1, str2) -> str1 + str2;

        // Реализация поставщика
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);

        // Реализация потребителя
        Consumer<Integer> helloPrinter = count -> {
            for (int i = 0; i < count; i++) {
                System.out.println("Привет");
            }
        };

        // Примеры использования
        String silhouette = "Силуэт";
        int size = silhouetteToSize.apply(silhouette);
        System.out.println("Размер силуэта: " + size);

        String result = stringAdder.apply("Привет, ", "мир!");
        System.out.println("Результат сложения строк: " + result);

        int randomNum = randomSupplier.get();
        System.out.println("Случайное число: " + randomNum);

        int count = 5;
        helloPrinter.accept(count);
    }
}