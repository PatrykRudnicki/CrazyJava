package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

interface Selector {
    public boolean pick(int value);
}

class EvenSelector implements Selector {
    @Override
    public boolean pick(final int value) {
        return value % 2 == 0;
    }
}

public class Sample {
    public static boolean isGreaterThan3(int number) {
        return number > 3;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int doubleIt(int number){
        return number * 2;
    }

    public static int totalValues(List<Integer> numbers, Selector selector){
        int result = 0;
        for(int e : numbers)
            if(selector.pick(e)) result += e;
        return result;
    }

    public static int secondTotalValues(List<Integer> numbers, Predicate<Integer> selector) {
        int result = 0;
        for(int e : numbers)
            if(selector.test(e)) result += e;
        return result;
    }

    public static int functionalTotalValues(List<Integer> numbers, Predicate<Integer> selector) {
        return numbers.stream()
                      .filter(selector)
                      .reduce(0, Math::addExact);
    }

    public static void main(String[] args){
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));

        //find the double of the first even number greater than 3
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = 0;
        for(int e : values){
            if(e > 3 && e % 2 == 0){
                result = e * 2;
                break;
            }
        }
        System.out.println(result);

        int secondResult = values.stream()
                .filter(Sample::isGreaterThan3)
                .filter(Sample::isEven)
                .map(Sample::doubleIt)
                .findFirst()
                .get();

        System.out.println(secondResult);

        Predicate<Integer> isGreaterThan3 = number -> number > 3;

        Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;

        int thirdResult = values.stream()
                .filter(isGreaterThan.apply(3))
                .filter(Sample::isEven)
                .map(Sample::doubleIt)
                .findFirst()
                .get();

        System.out.println(thirdResult);

        System.out.println(totalValues(values, e -> true));

        System.out.println(secondTotalValues(values, e -> e % 2 == 0)) ;
    }

    private static boolean isPrime(int number) {
        Predicate<Integer> isDivisible = divisor -> number % divisor == 0;

//        for(int i = 2; i < number; i++)
//            if(number % i == 0) return false;
//        return number > 1;
//        return number > 1 &&
//                IntStream.range(2, number)
//                         .noneMatch(index -> number % index == 0);

        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(index -> isDivisible.test(index));
    }
}
