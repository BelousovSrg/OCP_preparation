package one;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class C1897 {

    public static void main(String[] args) {
        Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19);
        //Stream<Integer> strm2 = strm1.filter(i->{ return i>5 && i<15; });  //2
        //strm2.forEach(System.out::print); //3
        System.out.println();

        Stream<Integer> strm3 = strm1.parallel().filter(i->i>5).filter(i->i<15).sequential();
        strm3.forEach(System.out::print);
        System.out.println();

        Stream<Integer> strm4 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19);
        Stream<Integer> strm5 = strm4.collect(
                Collectors.partitioningBy(i->{ return i>5 && i<15; })) // returns Map<Boolean, List<T>>
                .get(true)
                .stream();
        strm5.forEach(System.out::print);
        System.out.println();

        Stream<Integer> strm6 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19);
        Stream<Integer> strm7 = strm6.map(i-> i>5?i<15?i:null:null);
        strm7.forEach(System.out::print);

    }



}
