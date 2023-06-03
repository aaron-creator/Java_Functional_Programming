import java.util.List;

public class Structure01 {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        printAllNumbersinListStructure(List.of(1,2,3,4,5));
    }

    private static void printAllNumbersinListStructure(List<Integer> integers) {
        System.out.println(integers);
    }
}