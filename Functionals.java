import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;





public class Functionals {
    public static void main(String[] args) {


        Function<String, Integer> stringLength = (str) -> str.length();
        int length = stringLength.apply("Hello, World!");
        System.out.println("String length: " + length);


        BinaryOperator<String> concatenateStrings = (str1, str2) -> str1 + str2;
        String result = concatenateStrings.apply("Hello, ", "World!");
        System.out.println("Concatenated String: " + result);


        Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 100);
        int randomNumber = randomIntegerSupplier.get();
        System.out.println("Random Number: " + randomNumber);


        Consumer<Integer> printHelloXTimes = (count) -> {
            for (int i = 0; i < count; i++) {
                System.out.println("Привет");
            };
        };
    };
}