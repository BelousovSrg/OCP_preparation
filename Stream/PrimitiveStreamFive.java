package one;


import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamFive {


    public static void main(String[] args)
    {


        // part 1
        Stream<String> stream1= Stream.of("string 1","string 2","string 3","string 4","string 5");
        Stream<Integer> stream2 = stream1.map(x->x.length());
        //public interface Function<T,R>
        //{
        //R apply(T value)
        //}

        Stream<String> stream3= Stream.of("string 1","string 2","string 3","string 4","string 5");
        IntStream intStream1 = stream3.mapToInt(x->x.length());
        //public interface ToIntFunction<T,R>
        //{
        // int applyAsInt(T value)
        //}

        Stream<String> stream4= Stream.of("string 1","string 2","string 3","string 4","string 5");
        LongStream longStream1 = stream4.mapToLong(String::length);
        // public interface ToLongFunction<T,R>
        //{
        // long applyAsLong(T value)
        //}

        Stream<String> stream5 = Stream.of("string 1","string 2","string 3","string 4","string 5");
        DoubleStream doubleStream1 = stream5.mapToDouble(x->x.length());
        //public Interface ToDoubleFunction<T,R>
        //{
        //double applyAsDouble(T value)
        //}

        // part 2
        DoubleStream doubleStream2 = DoubleStream.of(1,2,3,4,5,6,7);
        Stream<String> stringStream1 = doubleStream2.mapToObj(x->x+"");
        // public interface DoubleFunction<T,R>
        //{
        //R apply(double val)
        //}

        DoubleStream doubleStream4 = DoubleStream.of(1,2,3,4,5,6,7);
        DoubleStream intStream2 = doubleStream4.map(x->x+1);
        // public interface DoubleUnaryOperator<T,R>
        //{
        // double applyAsDouble(double val)
        //}

        DoubleStream doubleStream3 = DoubleStream.of(1,2,3,4,5,6,7);
        IntStream intStream3 = doubleStream3.mapToInt(x->(int)x);
        // public interface DoubleToIntFunction<T,R>
        //{
        //int applyAsInt(double val)
        //}

        DoubleStream doubleStream5 = DoubleStream.of(1,2,3,4,5,6,7);
        LongStream  longStream2 = doubleStream5.mapToLong(x->(long)x);
        // public interface DoubleToLongFunction<T,R>
        //{
        //long applyAsLong(double val)
        //}

        /// part 3
        IntStream intStream4 = IntStream.of(1,2,3,4,5,6);
        Stream<String> stringStream2 = intStream4.mapToObj(x->x+"");
        //public interface IntFunction<T,R>
        //{
        //R apply(int value)
        //}
        IntStream intStream5 = IntStream.of(1,2,3,4,5,6);
        IntStream intStrea6 = intStream5.map(x->x+5);
        //public interface IntUnaryOperator
        //{
        //int applyAsInt(int value)
        //}

        IntStream intStream6 = IntStream.of(1,2,3,4,5,6);
        DoubleStream doubleStream6 = intStream6.mapToDouble(x->x);
        //public interface IntToDoubleFunction
        //{
        //double applyAsDouble(int value)
        //}

        IntStream intStream7 = IntStream.of(1,2,3,4,5,6);
        LongStream longStream3 = intStream7.mapToLong(x->x);
        //public interface IntToLongFunction
        //{
        //long applyAsLong(int value)
        //}

        /// part 4
        LongStream longStream4 = LongStream.of(1,2,3,4,5,6);
        Stream<String> stringStream3 = longStream4.mapToObj(x->x+"");
        //public interface LongFunction<T,R>
        //{
        //R apply(long value)
        //

        LongStream longStream5 = LongStream.of(1,2,3,4,5,6);
        LongStream longStream6 = longStream5.map(x->x+6);
        // public interface LongUnaryOperator
        //{
        // long applyAsLong (long value)
        //}

        LongStream longStream7 = LongStream.of(1,2,3,4,5,6);
        IntStream intStream8 = longStream7.mapToInt(x->(int)x);
        // public interface LongToInFunction
        //{
        //int applyAsInt (long value)
        //}

        LongStream longStream8= LongStream.of(1,2,3,4,5,6);
        DoubleStream doubleStream7 = longStream8.mapToDouble(x->x);
        // public interface LongToDoubleFunction
        //{
        //double ApplyAsDouble(long value)
        //}

    }

}
