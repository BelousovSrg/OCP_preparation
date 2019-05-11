package one;
import java.util.stream.*;

public class PrimitiveStreamThree {


    public static void main(String[] args)
    {

        // IntStream
        // DoubleStream
        // LongStream

        // Stream<T> map (Function <? super T> action);
        IntStream istream = IntStream.of(1,2,3,4,5);
        LongStream lstream = LongStream.of(1,2,3,4,5);
        DoubleStream dstream = DoubleStream.of(1.0,2.0,3.0,4.0,5.0);

        Stream<String> stream1 = Stream.of("String 1", "String 11", "String 22","String 333","String 4444","String 55555");
        IntStream istream1 = stream1.mapToInt(String::length);

        Stream<String> stream2= Stream.of("String 1", "String 11", "String 22","String 333","String 4444","String 55555");
        Stream<String> stream3 = stream2.map(x->x+" new "); // FUNCTION
        stream3.forEach(System.out::println);


        // map
        // mapToInt
        // mapToDouble
        // mapToLong

        // Obj to Obj - Function<T,R>
        // map

        // PrimitiveStream to ObjectStream  - IntFunction<R>, LongFunction<R>, DoubleFunction<R>
        // mapToObj



        // Obj to Primitive - ToIntFunction, ToDoubleFunction, ToLongFunction
        // mapToInt, mapToDouble, mapToLong

        // Primitive to Primitive - ToIntFunction, ToDoubleFunction, ToLongFunction, IntUnaryOperator


        Stream<String> stream4 = Stream.of("String 1", "String 11", "String 22","String 333","String 4444","String 55555");
        //stream4.map(x->x.length()).forEach(x->System.out.println(x)); // Function<T,R>
        //stream4.mapToInt(x->x.length()).forEach(x->System.out.println(x)); // ToIntFunction<T>, int applyAsInt(T)
        //stream4.mapToDouble(x->x.length()).forEach(x->System.out.println(x)); // ToDoubleFunction<T>, double applyAsDouble(T)
        //stream4.mapToLong(x->x.length()).forEach(x->System.out.println(x)); // ToLongFunction<T>, lond applyAsLong(T)

        IntStream intStream1 = IntStream.of(1,2,3,4,5,6);
        //intStream1.mapToObj(x->x+" Obj ").forEach(System.out::println); //IntFunction<T,R> apply(T el);
        //intStream1.map(x->x+1).forEach(System.out::println); // IntUnaryOperator<T,T> apply (T el);
        //intStream1.mapToDouble(x->x).forEach(System.out::println); // IntToDoubleFunction<T,R> apply
        //intStream1.mapToLong(x->x).forEach(System.out::println); // IntToLongFunction<T,R>

        DoubleStream doubleStream1 = DoubleStream.of(1.0,2.0,3.0,4.0,5.0,6.0);
        //doubleStream1.mapToObj(x->x+" Obj ").forEach(System.out::println); //DoubleFunction<T,R> apply(T el);
        //doubleStream1.map(x->x+1).forEach(System.out::println); //IntUnaryOperator<T,T> apply (T el);
        //doubleStream1.mapToLong(x->(long)x+10).forEach(System.out::println); // DoubleToLongFunction<T,R>
        //doubleStream1.mapToInt(x->(int)x+10).forEach(System.out::println); // DoubleToIntFunction<T,R>

        LongStream longStream1 = LongStream.of(1,2,3,4,5,6);
        //longStream1.mapToObj(x->x+" Obj ").forEach(System.out::println); // LongFunction<T,R>
        //longStream1.map(x->x+2).forEach(System.out::println); // LongUnaryOperator<T>
        //longStream1.mapToDouble(x->x+3).forEach(System.out::println); // LongToDoubleFunction<T,R>
        //longStream1.mapToInt(x->(int)x+10).forEach(System.out::println); //LongToIntFunction<T,R>







    }
}
