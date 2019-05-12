package one;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class PrimitiveStreamFour {


    public static void main(String[] args) {

        Stream<String> s1;
        IntStream i1;
        LongStream l1;
        DoubleStream d1;

        // Functional Interfaces
        // Optional
        // Streams (intermediate, terminal), switch between streams, streams Optional



        // part 1 ObjStream
        //Stream<String> to Stream<Integer>

        Stream<String> stream1 = Stream.of("String 1", "String 11", "String 22", "String 333", "String 4444", "String 55555");
        Stream<Integer> stream2 = stream1.map(String::length);
        // interface Function<T,R>
        // {
        // R apply(T t)
        //}

        //Stream<String> to IntStream
        Stream<String> stream3 = Stream.of("String 1", "String 11", "String 22", "String 333", "String 4444", "String 55555");
        IntStream intStream = stream3.mapToInt(x->x.length());
        // interface ToIntFunction<T>
        //{
            // int applyAsInt(T value)
        //}

        //Stream<String> to DoubleStream
        Stream<String> stream4 = Stream.of("String 1", "String 11", "String 22", "String 333", "String 4444", "String 55555");
        DoubleStream doubleStream1 = stream3.mapToDouble(x->(double) x.length());
        // interface ToDoubletFunction<T>
        //{
        // double applyAsDouble(T value)
        //}

        //Stream<String> to DoubleStream
        Stream<String> stream5 = Stream.of("String 1", "String 11", "String 22", "String 333", "String 4444", "String 55555");
        LongStream longStream1 = stream5.mapToLong(x->x.length());
        // interface ToLongFunction<T>
        //{
        // long applyAsLong(T value)
        //}

        ////// part 2 DoubleStream
        DoubleStream doubleStream2 = DoubleStream.of(1,2,3,4,5,6,7);
        Stream<String> objStream =  doubleStream2.mapToObj(x->x+" string part");
        // interface DoubleFunction<R>
        //{
          // R apply(double value)
        //}

        DoubleStream doubleStream3 = DoubleStream.of(1,2,3,4,5,6,7);
        DoubleStream doubleStream4=doubleStream3.map(x->x+1);
        // interface DoubleUnaryOperator<T,T>
        //{
          //T applyAsDouble(T value)
        //}

        DoubleStream doubleStream5 = DoubleStream.of(1,2,3,4,5,6,7);
        IntStream intStream1=doubleStream5.mapToInt(x-> (int) x+1);
        // interface DoubleToIntFunction<T,R>
        //{
        //int applyAsInt(T value)
        //}

        DoubleStream doubleStream6 = DoubleStream.of(1,2,3,4,5,6,7);
        LongStream longStream2=doubleStream6.mapToLong(x->(long)x);
        // interface DoubleToLongFunction<T,R>
        //{
        //long applyAsLong(T value)
        //}

        //// part 3 IntStream
        IntStream intStream2 = IntStream.of(1,2,3,4,5,6);
        Stream<String> stringStream1 = intStream2.mapToObj(x->x+" end ");
        // interface IntFunction<R>
        //{
          // R apply (int value)
        //}

        IntStream intStream3 = IntStream.of(1,2,3,4,5,6);
        IntStream intStream4 = intStream3.map(x->x+1);
        // IntUnaryOperator<T,R>
        //{
            // int applyAsInt(T value)
        //}

        IntStream intStream5 = IntStream.of(1,2,3,4,5,6);
        DoubleStream doubleStream7 = intStream5.mapToDouble(x->x+3);
        // interface IntToDoubleFunction<T,R>
        //{
        //double applyAsDouble(int value)
        //}
        //

        IntStream intStream6 = IntStream.of(1,2,3,4,5,6);
        LongStream longStream3 = intStream6.mapToLong(x->x);
        // interface IntToLongFunction<T,R>
        // {
        // long applyAsLong(int value)
        // }

        ////part 4 LongStream
        LongStream longStream4 = LongStream.of(1,2,3,4,5,6,7);
        Stream<String> stringStream2 = longStream4.mapToObj(x->x + "str");
        // public interface LongFunction<T,R>
        //{
        //R apply(long value)
        //}
        LongStream longStream5 = LongStream.of(1,2,3,4,5,6,7);
        LongStream longStream6 = longStream5.map(x->x+2);
        // public interface LongUnaryOperator
        //{
        //long applyAsLong(long value)
        //}

        LongStream longStream7 = LongStream.of(1,2,3,4,5,6,7);
        IntStream intStream7 = longStream7.mapToInt(x->(int)x);
        // public interface LongToIntFunction<T,R>
        //{
        // int applyAsInt(long value)
        //}

        LongStream longStream8 = LongStream.of(1,2,3,4,5,6,7);
        DoubleStream doubleStream8 = longStream8.mapToDouble(x->x);
        // public interface LongToDoubleFunction<T,R>
        //{
        // double applyAsDouble(
        //}

    }
}
