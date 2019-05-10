package one;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamIntermediateTwo
{


    // long count();
    // Optional<T> min/max() (Comparator <? super T> comparator);
    // Optional<T> findAny(),findFirst();
    // boolean allMatch(), anyMatch(), noneMatch(Predicate<? super T> predicate) // boolean test
    // void forEach(Consumer <? super T> action);
    // <T> reduce (T identity, BinaryOperator<T> accumulator)
    // Optional <T> reduce (BinaryOperator<T> accumulator)
    // collect

    // Stream <T> filter( Predicate <? super T> predicate)
    // Stream <T> distinct()
    // Stream <T> limit(int limit), skip(int number);
    // <R> Stream<R> map (Function<?super T, ? extends R> mapper)
    // flatMap - pipec
    // Stream<T> sorted()
    // Stream<T> sorted (Comparator<? super T> comparator)
    // Stream<T> peek (Comsumer <? super T> action)
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("String 1","String 2","String 3","String 4","String 5");
        //stream1.filter(x->x=="String 1").forEach(System.out::println);

        Stream<String> stream2 = Stream.of("String 1", "String 1", "String 2","String 3","String 4","String 5");
        stream2.distinct().forEach(System.out::println);

        Stream<Integer> stream3 = Stream.iterate(0,x->x+1);
        stream3.skip(10).limit(10).forEach(System.out::println);

        Stream<String> stream4 = Stream.of("String 1", "String 1", "String 2","String 3","String 4","String 5");
        stream4.map(x->x.length()).forEach(System.out::println);


        Stream<String> stream5 = Stream.of("String 1", "String 11", "String 22","String 333","String 4444","String 55555");
        stream5.sorted().forEach(System.out::println);

        Stream<String> stream6 = Stream.of("String 1", "String 11", "String 22","String 333","String 4444","String 55555");
        stream6.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();
        Stream<String> stream7 = Stream.of("String 1", "String 11", "String 22","String 333","String 4444","String 55555");
        stream7.peek(System.out::println).count();

    }






}
