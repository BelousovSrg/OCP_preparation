package one;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamFour {


    public static void main(String[] args) {

        Supplier<String> s1 = ()->new String("string supplier");
        System.out.println(s1.get());

        Consumer<String> c1 = (x)->System.out.println(x.concat(" 20"));
        c1.accept("first_part");

        BiConsumer<String,String>  bc1 = (x,y)->System.out.println(x+y);

        Map<String, String> map = new HashMap<>();
        BiConsumer<String,String>  bc2 = map::put;
        bc1.accept("123","456");
        bc2.accept("aaa","45666");
        System.out.println(map);

        Predicate<Integer> p1 = (x)->x>3;
        Predicate<String> p2 = String::isEmpty;

        System.out.println(p1.test(10));
        System.out.println(p2.test("string"));

        BiPredicate<String, String> bp1 = (x,y)-> x.length()>y.length();
        BiPredicate<String, String> bp2 = String::startsWith;

        System.out.println(bp1.test("123","1234"));
        System.out.println(bp2.test("123","12"));

        Function<String, Integer> f1 = (x)->x.length();
        Function<String, Integer> f2 = String::length;

        System.out.println(f1.apply("lenht"));
        System.out.println(f2.apply("lenht"));

        BiFunction<String, String, String> bf1 = (x,y)->x+y;
        BiFunction<String, String, String> bf2 = String::concat;

        System.out.println(bf1.apply("11","11"));
        System.out.println(bf2.apply("22","22"));


        UnaryOperator<String> uo1 = (x)->x.concat("3");
        UnaryOperator<String> uo2 = String::toUpperCase;

        System.out.println(uo1.apply("0"));
        System.out.println(uo2.apply("to upper"));

        BinaryOperator<String> bo1 = (x,y)->x.concat(y);
        BinaryOperator<String> bo2 = String::concat;

        System.out.println(bo1.apply("con","CAT"));
        System.out.println(bo2.apply("con","cat 1"));






        Optional<Integer> op1= Optional.of(1);
        System.out.println(op1.get());

        op1.ifPresent(System.out::println);
        System.out.println(op1.isPresent());

        Optional<Integer> op2= Optional.empty();
        System.out.println(op2.orElse(100));

        System.out.println(op2.orElseGet(()->new Integer(10)));
        //op2.orElseThrow(()->new NullPointerException());


        // terminal operator
        Stream<String> stream1 = Stream.of("string 1","string 22","string 333","string 4444");
        System.out.println(stream1.count());

        Stream<String> stream2 = Stream.of("string 1","string 22","string 333","string 4444");
        stream2.min((x,y)->x.length()-y.length()).ifPresent(System.out::println);

        Stream<String> stream3 = Stream.of("string 1","string 22","string 333","string 4444");
        stream3.findAny().ifPresent(System.out::println);

        Stream<String> stream4 = Stream.of("string 1","string 22","string 333","string 4444");
        System.out.println(stream4.allMatch(x->x=="string 1"));

        Stream<String> stream5 = Stream.of("string 1","string 22","string 333","string 4444");
        stream5.forEach(x->System.out.println(x));

        // reduce
        // T reduce (T identity , BinaryOperator<T> accumulator);
        //Optional<T> reduce (BinaryOperator<T> accumulator);
        Stream<String> stream6 = Stream.of("string 1","string 22","string 333","string 4444");
        System.out.println(stream6.reduce("str",(x,y)->x.concat(y)));

        Stream<String> stream7 = Stream.of("string 1","string 22","string 333","string 4444");
        System.out.println(stream7.reduce("str deff ",String::concat));

        Stream<String> stream8 = Stream.of("string 1","string 22","string 333","string 4444");

        stream8.reduce((x,y)->x.concat(y)).ifPresent(System.out::println);

        // collect

        // <R> R collect (Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
        // <R, A> R collect (Collector <? super T, A,R> collector)

        Stream<String> stream9 = Stream.of("w","o","l","f");
        StringBuilder word =stream9.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);

        Stream<String> stream10 = Stream.of("w","o","l","f");
        TreeSet<String> set = stream10.collect(TreeSet::new, TreeSet::add,TreeSet::addAll);
        System.out.println(set);

        Stream<String> stream11 = Stream.of("w","o","l","f");
        TreeSet<String> set2 = stream11.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set2);

        Stream<String> stream12 = Stream.of("w","o","l","f");
        Set<String> set3 = stream12.collect(Collectors.toSet());
        System.out.println(set3);



    }
}
