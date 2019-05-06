package one;

import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.stream.*;


public class PrimitiveStreamTwo {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1,2,3,4);
        System.out.println(stream1.reduce(0,(x,y)->x+y)); // BiFunction or BinaryOperator

        Stream<Integer> stream2 = Stream.of(1,2,3,4);
        System.out.println(stream2.mapToInt(x->x).sum());//Function or UnaryOperator

        IntStream stream3 = IntStream.of(1,2,3,4);
        OptionalDouble avg = stream3.average();
        System.out.println(avg.getAsDouble());
        System.out.println();
        // IntStream - int short byte char
        // LongStream - long
        // DoubleStream - double

        DoubleStream stream4 = DoubleStream.empty();
        DoubleStream stream5 = DoubleStream.of(1.5);
        DoubleStream stream6 = DoubleStream.of(1.5,3.0,5.6,10.25);
        stream5.forEach(System.out::println);
        System.out.println();
        stream6.forEach(System.out::println);

        DoubleStream stream7 = DoubleStream.generate(()->Math.random()); // Supplier
        DoubleStream stream8 = DoubleStream.iterate(.5,d->d/2); //Function or UnaryOperator
        System.out.println();
        stream7.limit(3).forEach(x->System.out.println(x)); //Consumer
        System.out.println();
        stream8.limit(3).forEach(x->System.out.println(x)); //Consumer
        System.out.println();

        IntStream count = IntStream.iterate(1,n->n+1).limit(5); //Function or UnaryOperator
        count.forEach(System.out::println);

        IntStream count1 = IntStream.range(1,6);
        count1.forEach(System.out::print);
        System.out.println();

        IntStream count2 = IntStream.rangeClosed(1,5);
        count2.forEach(System.out::print);
        System.out.println();

        Stream<String> stream9 = Stream.of("string 1","strimg 22","string 333");
        IntStream stream10 = stream9.mapToInt(s->s.length());

        stream10.forEach(System.out::print);

        // Optional
        System.out.println();
        IntStream stream11=IntStream.rangeClosed(1,10);
        OptionalDouble optd = stream11.average();

        optd.ifPresent(System.out::println);
        System.out.println(optd.getAsDouble());
        System.out.println(optd.orElseGet(()->Double.NaN));

        LongStream stream12 = LongStream.of(5,10,20);
        long sum = stream12.sum();
        System.out.println(sum);

        IntStream stream13 = IntStream.of(1,2,3,4,5,6,7,8);
        IntSummaryStatistics stat = stream13.summaryStatistics();
        if(stat.getCount()==0) throw new NullPointerException();
        System.out.println(stat.getMax()-stat.getMin());

        // Functional interfaces for boolean

        BooleanSupplier b1 = ()->true;
        BooleanSupplier b2 = ()->Math.random()>.5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());


        Optional<Integer> opt1 = Optional.of(333);
        opt1.map(n->""+n).filter(s->s.length()==3).ifPresent(System.out::println);

        Optional<String> opt2 = Optional.of("string 1");
        Optional<Integer> opt3 = opt2.map((s)->s.length());
        opt3.ifPresent(System.out::println);


        Stream<String> stream14 = Stream.of("lions","tigers","bears");
        String result = stream14.collect(Collectors.joining(", "));
        System.out.println(result);

        Stream<String> stream15 = Stream.of("lions","tigers","bears");
        Double resultLenght = stream15.collect(Collectors.averagingInt(String::length));
        System.out.println(resultLenght);


        Stream<String> stream16 = Stream.of("lions","tigers","bears");
        TreeSet<String> result1 = stream16.filter(s->s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result1);


        Stream<String> stream17 = Stream.of("lions","tigers","bears");
        Map<String,Integer> epta = stream17.collect(Collectors.toMap(s->s,String::length));
        System.out.println(epta);





    }

}
