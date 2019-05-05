package one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamSourceTerminal {

    public static void main(String[] args) {
        //soure operatons
        Stream<String> empty = Stream.empty();
        Stream<Integer> int1 = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3,4,5);

        List<String> list = Arrays.asList("a","b","c");
        Stream<String> fromList=list.stream();

        //terminal operations

        //long count();
        Stream<String> s = Stream.of("element 1","element2","element3");
        System.out.println(s.count());

        //Optional<T> min (<? super T> comparator)
        //Optional<T> max (<? super T> comparator)

        Stream<String> s1 = Stream.of("lenght 1", "lenght 12","length 123");
        Optional<String> min = s1.min((str1,str2)->str1.length()-str2.length());
        min.ifPresent(x->System.out.println(x));
        min.ifPresent(System.out::println);

        // Optional<T> findAny();
        // Optional<T> findFirst();
        Stream<String> s2 = Stream.of("string 1", "string 2","string 3");
        Stream<String> is2 = Stream.generate(()->"noend str");
        s2.findAny().ifPresent(System.out::println);
        is2.findAny().ifPresent(System.out::println);

        // boolean anyMatch (Predicate <? super T> predicate)
        // boolean allMatch (Predicate <? super T> predicate)
        // boolean noneMatch (Predicate <? super T> predicate)
        //

        List<String> list2 = Arrays.asList("String 1", "2 string","string 3");
        Stream<String> is3 = Stream.generate(()->"just string");
        Predicate<String> pred = x->Character.isLetter(x.charAt(0));

        System.out.println(list2.stream().anyMatch(pred));
        System.out.println(list2.stream().allMatch(pred));
        System.out.println(list2.stream().noneMatch(pred));
        System.out.println(is3.anyMatch(pred));

        // void forEach(Consumer<? super T> action)

        Stream<String> s3 = Stream.of("string 1", "string 2","string 3");
        //s3.forEach(System.out::println);
        s3.forEach((x)->System.out.println(x));

        // T reduce (T identity, BinaryOperator<T> accumulator)
        // Optional<T> reduce (BinaryOperator<T> accumulator)
        // <U> U reduce (U identity, BiFunction <U,? super T, U> accumulator, BinaryOperator<U> combiner)

        String[] array = new String[]{"w","o","l","f"};
        String result = "";
        for (String sn: array)
        {
        result +=sn;
                }
        System.out.println(result);

        Stream<String> stream3 = Stream.of("w","o","l","f");
        String word = stream3.reduce("",(str3,cstr4)->str3+cstr4);
        System.out.println(word);

        Stream<Integer> stream4 = Stream.of(1,2,3,5,6);
        Integer digit = stream4.reduce(1,(int3,int4)->int3+int4);
        System.out.println(digit);

        BinaryOperator<Integer> op = (a,b)->a+b;
        Stream<Integer> emptyStr = Stream.empty();
        Stream<Integer> oneEl = Stream.of(3);
        Stream<Integer> threeEl = Stream.of(5,5,6);

        emptyStr.reduce(op).ifPresent(System.out::println);
        oneEl.reduce(op).ifPresent(System.out::println);
        threeEl.reduce(op).ifPresent(System.out::println);

        // collect()
        // <R> R collect(Supplier<R> supplier, BiConsumer<R, ?super T> accumulator, Biconsumer<R,R combiner>)
        // <R,A> R collect (Collector <? super T, A, R> collector)

        Stream<String> stream5 = Stream.of("w","o","l","f");
        StringBuilder word1 = stream5.collect(StringBuilder::new, StringBuilder::append,StringBuilder::append);

        //intermediate operations

        // Stream<T> filter (Predicate<? super T> predicate)
        //
        Stream<String> s4 = Stream.of("string 1","string 2", "string 3","ololo 4");
        s4.filter(x->x.startsWith("ol")).forEach(System.out::println);

        // Stream<T> distinct();

        Stream<String> s5 = Stream.of("string 1","string 2", "string 3","ololo 4","ololo 4");
        s5.distinct().forEach(System.out::println);

        // Stream<T> limit (int maxSize);
        // Stream<T> skip (int n);

        Stream<Integer> s6 = Stream.iterate(1,(n)->n+1);
        s6.skip(5).limit(2).forEach((x)->System.out.print(x+"-"));

        // <R> Stream<R> map(Funnction<? super T,? extends R> mapper)
        Stream<String> s7 = Stream.of("string 1","string 2", "string 3","ololo 4","ololo 4");
        s7.map(String::length).forEach(System.out::println);

        //flatMap

        List<String> one = Arrays.asList();
        List<String> two = Arrays.asList("example one");
        List<String> theee = Arrays.asList("example two","example three");
        Stream<List<String>> allTogether = Stream.of(one,two,theee);

        allTogether.flatMap(a->a.stream()).forEach(System.out::println);

        //sorted
        //Stream<T> sorted()
        //Stream<T> sorted(Comparator <? super> comparator)
        Stream<String> s8 = Stream.of("Aaaaaa","Bbbbbbbbb");
        ///s8.sorted().forEach(System.out::print);
        s8.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Stream<T> peek (Consumer <? super T> action)
        Stream<String> s9 = Stream.of("string 1","string 2", "A string 3","ololo 4","ololo 4");
        s9.filter(x->x.startsWith("A")).peek(System.out::println).count();


        //
        List<String> list3 = Arrays.asList("1111","1234","5678","9999","String 2","String 4","String 5");
        list3.stream().filter(n->n.length()==4).sorted().limit(2).forEach(System.out::println);

        Stream.generate(()->"string 4").filter(x->x.length()==8).limit(2).sorted().forEach(System.out::println);

        Stream.iterate(1,x->x+1).filter(x->x%2==1).limit(5).forEach(System.out::println);
        // 13579
        //11233455
        Stream.iterate(1,x->x+1).filter(x->x%2==1).peek(System.out::println).limit(5).forEach(System.out::println);
        //1133557799






    }
}
