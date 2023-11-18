import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Functional01 {
    public static void main(String[] args) {
        System.out.println("Hello World");

//        printallNumbersinFunctional(List.of(1,2,3,4,5));

        printEvenNumbers(List.of(1, 2, 3, 4, 5));
        printOddNumbers(List.of(1, 2, 3, 4, 5));
        printAllCourses(List.of("Spring", "Spring Boot", "AWS", "Microservices"));
        printCoursesWithSpring(List.of("Spring", "Spring Boot", "AWS", "Microservices"));//uses filter method
        printNameofCourseswith4digit(List.of("Spring", "Spring Boot", "AWS", "Microservices"));//uses filter method
        printSquaresofAllNumbers(List.of(1, 2, 3, 4, 5)); //uses map method in it.
        printCubesofAllNumbers(List.of(1, 2, 3, 4, 5)); //uses map method in it.
        printNumberofCharsinCourseList(List.of("Spring", "Spring Boot", "AWS", "Microservices"));//uses map method
        int sum = printSumofAllNumbersinList(List.of(1, 2, 3, 4, 5, 6)); //uses reduce method
        System.out.println("Sum is " + sum);
        //using distinct method
        printallUniqueNumbersinList(List.of(1,2,2,3,3,4,5));
        //using sorted method
        printallNumbersinSortedWay(List.of(10,8,6,7,4,3,2,1,9,5));
        //using both distinct and sorted method
        printallDistinctandSortedOnes(List.of(10,8,6,7,4,3,2,1,9,5,5,7,10,9));
        //using sorted with natural and reverse order method for numbers and sorting Strings alphabetically
        printallinSortedNaturalandReverseOrder(List.of(10,8,6,7,4,3,2,1,9,5));
        //using sorted method with comparater.comparing() for Strings
        sortallStringaccording(List.of("Spring", "SpringBoot", "AWS", "Microservices, Java"));
        // print and Display numbers in a List
        printANDDisplayNumbers(List.of(1, 2, 3, 4, 5, 6));

        List<Integer> doubleListofNums = doubleList(List.of(1, 2, 3, 4, 5));// uses collect(Collectors.toList()) method
        doubleListofNums.stream().forEach(System.out::println);
        List<Integer> ListofEvenNums = ListofEvenNumbers(List.of(1, 2, 3, 4, 5));// uses collect(Collectors.toList()) method
        ListofEvenNums.stream().forEach(System.out::println);
        List<Integer> lengthofCourseTitles = lengthofCourseTitles(List.of("Spring", "SpringBoot", "AWS", "Microservices"));  // uses collect(Collectors.toList()) method
        lengthofCourseTitles.stream().forEach(System.out::println);

        Funtional_Code functFuntionalCode = new Funtional_Code();
        functFuntionalCode.printAllDuplicatesInList(List.of(10,20,10,30,40,30,50,80,80,80,100));

    }

    private static void sortallStringaccording(List<String> courses) {
        System.out.println("Sorting Strings natually");
        courses.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.println("Sorting Strings in reverse order");
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("Sorting Strings according to length");
        courses.stream()
                .sorted(Comparator.comparing(s -> s.length()))
                .forEach(System.out::println);
    }

    private static void printallinSortedNaturalandReverseOrder(List<Integer> integers) {
        System.out.println("Sorted in Natural Order");
        integers.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.println("Sorted in Reverse Order");
        integers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void printallDistinctandSortedOnes(List<Integer> integers) {
        System.out.println("Distinct and Sorted Ones: ");
        integers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    private static void printallNumbersinSortedWay(List<Integer> integers) {
        System.out.println("Sorted ones: ");
        integers.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void printallUniqueNumbersinList(List<Integer> integers) {
        System.out.println("Distinct ones: ");
        integers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static List<Integer> lengthofCourseTitles(List<String> courses) {
        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> ListofEvenNumbers(List<Integer> integers) {
        return integers.stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> integers) {
        return integers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }


    private static int sum(int a, int b){
        return a + b;
    }
    private static Integer printSumofAllNumbersinList(List<Integer> integers) {
//        System.out.println("Sum is ;");
        return integers.stream()
//                .reduce(0,Functional01::sum);
                .reduce(0,(x,y)-> x+y);  //uses  reduce and lambda expression for sum function
    }

    private static void printNumberofCharsinCourseList(List<String> courses) {
        courses.stream()
                .map(course -> course + " " +course.length())
                .forEach(System.out::println);
    }

    private static void printCubesofAllNumbers(List<Integer> integers) {
        integers.stream()
                .map(n -> Math.pow(n,3))
                .forEach(System.out::println);
    }

    private static void printSquaresofAllNumbers(List<Integer> integers) {
        integers.stream()
                .map(number -> number*number)
                .forEach(System.out::println);
    }

    private static void printNameofCourseswith4digit(List<String> courses) {
        System.out.println("Course list with length greater than 4 : ");
        courses.stream()
                .filter(course -> course.length()>4)
                .forEach(System.out ::println);
    }

    private static void printCoursesWithSpring(List<String> courses) {
        System.out.println("Courses with Spring are  :");
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out ::println);
    }

    private static void printAllCourses(List<String> cousres) {
        System.out.println("Course are : ");
        cousres.stream()
                .forEach(System.out ::println);
    }
    public static void printnum(int number){
        System.out.println(number);
    }

    private  static boolean isEven(int number) {return number%2==0 ;}
    private static void printallNumbersinFunctional(List<Integer> integers) {
        integers.stream()
                .forEach(Functional01::printnum);
    }

    private static void printEvenNumbers(List<Integer> integers) {
        System.out.println("Even numbers");
     integers.stream()
//             .filter(Functional01::isEven) without lambda exp
             .filter(number -> (number % 2) == 0)  //withlambda expression.
             .forEach(Functional01::printnum);
    }
    private static void printOddNumbers(List<Integer>integers){
        System.out.println("Odd numbers");
        integers.stream()
                .filter(number -> (number % 2) != 0)
                .forEach(System.out::println);
    }

    private static void printANDDisplayNumbers(List<Integer>integers){
        System.out.println("Numbers Lists");
        integers.stream()
                .forEach(System.out::println);
    }
}
