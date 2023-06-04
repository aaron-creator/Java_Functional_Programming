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
        //using sorted method
        //using both distinct and sorted method
        //using sorted with natural and reverse order method for numbers and sorting Strings alphabetically
        //using sorted method with comparater.comparing()
        List<Integer> doubleListofNums = doubleList(List.of(1, 2, 3, 4, 5));// uses collect(Collectors.toList()) method
        doubleListofNums.stream().forEach(System.out::println);
        List<Integer> ListofEvenNums = ListofEvenNumbers(List.of(1, 2, 3, 4, 5));// uses collect(Collectors.toList()) method
        ListofEvenNums.stream().forEach(System.out::println);
        List<Integer> lengthofCourseTitles = lengthofCourseTitles(List.of("Spring", "Spring Boot", "AWS", "Microservices"));  // uses collect(Collectors.toList()) method
        lengthofCourseTitles.stream().forEach(System.out::println);

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


}