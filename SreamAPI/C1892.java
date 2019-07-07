package one;


import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1892 {

    public static void main(String[] args) {
        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1
        Object obj = values.collect(Collectors.partitioningBy(x->x%2==0)); //2 четное
        System.out.println(obj);

    }
}
