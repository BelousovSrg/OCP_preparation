package one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class StreamIntermediateOne {
    public static void main(String[] args)
    {
        // filter
        // Stream<T> filter (Predicate<? super T> predicate)

        Stream<String> stream1 = Stream.of("String 11","String 22", "String 333");
        stream1.filter((x)->x.length()>3).forEach(System.out::println);

        // Stream <T> distinct()
        Stream<String> stream2 = Stream.of("String 11","String 22", "String 333","String 333");
        stream2.distinct().forEach(System.out::println);


        // Stream<T> limit(int maxSize);
        // Stream<T> skip(int n);

        Stream<Integer> stream3 = Stream.iterate(1,n->n+1);
        stream3.skip(5).limit(10).forEach((x)->System.out.print(x+"-"));

        // <R> Stream<R> map (Function<? super T, ? extends R> mapper)
        Stream<String> stream4 = Stream.of("String 11","String 22", "String 333","String 333");
        stream4.map(x->x.length()).forEach(System.out::println);

        //flatMap
        //<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("one string");
        List<String> two = Arrays.asList("two string 1","two string 2");
        Stream<List<String>> stream5 = Stream.of(zero,one,two);
        stream5.flatMap(x->x.stream()).forEach(System.out::println);

        // Stream<T> sorted();
        // Stream<T> sorted(Comparator<? super T> comparator)
        //
        Stream<String> stream6 = Stream.of("String 11","String 22", "String 333","String 333");
        stream6.sorted().forEach(System.out::println);

        Stream<String> stream7 = Stream.of("String 11","String 22", "String 333","String 333");
        stream7.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Stream<T> peek (Consumer<? super T> action)
        Stream<String> stream8 = Stream.of("String 11","AString 22", "AString 333","String 333");
        stream8.filter(x->x.startsWith("A")).peek(System.out::println).count();

    }

}
