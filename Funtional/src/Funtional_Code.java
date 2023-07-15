import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Funtional_Code {
    public void printAllDuplicatesInList(List<Integer> numbers){
        Set<Integer> setOfIntegers = new HashSet<>();
        System.out.println("Duplicates are: ");
        numbers.stream()
                .filter(x->!setOfIntegers.add(x))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
