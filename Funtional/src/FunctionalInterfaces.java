import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    public static Integer returnSumofSquaresAllEvenNumbersinList(List<Integer> numbers){
        Predicate<Integer> predicate = n-> (n % 2 == 0);
        Function<Integer, Integer> function =  x -> x * x;

        BinaryOperator<Integer> binaryOperator =   Integer::sum;
        BinaryOperator<Integer> binaryOperatorSupplier2 = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };

//        Supplier<BinaryOperator<Integer>> binaryOperatorSupplier1 = () -> (x, y) -> x + y;
        return numbers.stream()
                .filter(predicate)
                .map(function)
                .reduce(0, binaryOperator);
//                .reduce(0, binaryOperatorSupplier1.get());
    }

    public static void printSquaresofAllnumbrsinList(List<Integer> numbers){
        numbers.stream()
                .filter(x->x%2==0)
                .map(x -> x*x)
                .forEach(System.out::println);
    }
}
