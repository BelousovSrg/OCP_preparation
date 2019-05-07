package one;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamThree {


    public static void main(String[] args) {

        // source
        Stream<String> stream1 = Stream.of("string1","string2","string3","string4");

        // terminal
        // long count();
        // Optional<T> min(Comparator <? super T> comparator); max();
        // Optional<T> findFirst(); findAny();
        // boolean anyMatch(Predicate<? super T> predicate); noneMatch; Allmatch;
        // void forEach(Consumer <? super T> action)
        // reduce
        // collect

        System.out.println(stream1.count());

        Stream<String> stream2 = Stream.of("string1","string22","string333","string4444");
        Optional<String> op1 = stream2.min((s1,s2)->s1.length()-s2.length());
        op1.ifPresent(x->System.out.println(x));

        Stream<String> stream3 = Stream.of("string1","string22","string333","string4444");
        System.out.println(stream3.findAny().get());

        Stream<String> stream4 = Stream.of("string1","string22","string333","string4444");
        System.out.println(stream4.anyMatch(x->x=="string1"));

        Stream<String> stream5 = Stream.of("string1","string22","string333","string4444");
        stream5.forEach(System.out::println);

        // T reduce (T identity, BinaryOperator<T> accumulator);
        Stream<String> stream6 = Stream.of("string1","string22","string333","string4444");
        System.out.println(stream6.reduce("---",(a,b)->a+b));

        //Optional<T> reduce (BinaryOperator<T> accumulator)
        Stream<String> stream7 = Stream.of("string1","string22","string333","string4444");
        System.out.println(stream7.reduce((a,b)->a+b).get());

        //<U> U reduce (U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)

        // collect
        // <R> R collect (Suppler<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
        //<R,A> R collect (Collector<? super T,A,R> collector);

        Stream<String> stream = Stream.of("string1","string22","string333","string4444");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append );
        System.out.println(word);




    }
}
