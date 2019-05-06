package one;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PrimitiveStream {

    public static void main(String[] args) {


        Stream<Integer> stream1 = Stream.of(1,2,3);
        System.out.println(stream1.reduce(0,(x,y)->x+y));

        Stream<Integer> stream2 = Stream.of(1,2,3);
        System.out.println(stream2.mapToInt(x->x).sum());

        IntStream intStream = IntStream.of(1,2,3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        DoubleStream em = DoubleStream.empty();
        DoubleStream one = DoubleStream.of(1.0);
        DoubleStream varargs = DoubleStream.of(1.0,2.0,4.0,6.0);
        System.out.println( );
        one.forEach(System.out::println);
        varargs.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(()->Math.random());
        DoubleStream fractions = DoubleStream.iterate(.5,d->d/2);

        random.limit(3).forEach(System.out::println);
        System.out.println( );
        fractions.limit(3).forEach((x)->System.out.println(x));

        IntStream is= IntStream.iterate(1,n->n+1).limit(5);
        is.forEach(System.out::println);

        IntStream.range(1,6).forEach(System.out::println);
        IntStream.rangeClosed(1,5).forEach(System.out::println);

        Stream<String> objStream = Stream.of("String 11","string 22");
        IntStream is1 = objStream.mapToInt(s->s.length());
        is1.forEach(System.out::println);






    }




}
