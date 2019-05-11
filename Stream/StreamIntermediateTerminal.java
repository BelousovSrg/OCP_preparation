package one;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateTerminal {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("String 1", "String 11", "String 22","String 333","String 4444","String 55555");
        System.out.println(stream1.count()); // long

        Stream<String> stream2 = Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");
        stream2.min((x,y)->x.length()-y.length()).ifPresent(x->System.out.println(x)); //Optional<T> min (Comparator <? super T> c)

        Stream<String> stream3 = Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");

        // T reduce (T, BinaryOperator<T> accumulator)
        // Optional<T> reduce (BinaryOperator<T> accumulator)

        System.out.println(stream3.reduce("",(x,y)->(x+" " +y+" ")));

        Stream<String> stream4 = Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");
        stream4.reduce((x,y)->(x+" " +y+" ")).ifPresent(System.out::println);

        //<R> collect (Supplier <R> supplier, BiConsumer<R, ? super T> accumulator, Biconsumer <R,R> combiner);
        // <R, A> R collect(Collector <? super T,A,R> collector)

        Stream<String> stream5 = Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");
        StringBuilder word = stream5.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);

        Stream<String> stream6= Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");
        TreeSet<String> set = stream6.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set);

        Stream<String> stream7= Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");
        TreeSet<String> set1 = stream7.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set1);

        Stream<String> stream8= Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");
        Set<String> set2 = stream8.collect(Collectors.toSet());
        System.out.println(set2);


        Stream<String> stream9= Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");
        // <R> Stream <R> map (Function <? super T, ? extends R> mapper)
        stream9.map(String::length).forEach(System.out::println);

        //Stream<T> peek (Consumer <? super T> action)

        Stream<String> stream10= Stream.of("String1","String", "String 1", "String 22","String 333","String 4444","String 55555");

        stream10.peek(x->System.out.println(x)).count();
        //System.out.println(stream10.count());









    }
}
