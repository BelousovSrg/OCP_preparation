import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class FunctionalIfaces
{

    public static void main(String[] args)
    {
        // Supplier<T>, 0 , T get
        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = ()->new StringBuilder();
        System.out.println(s1);
        System.out.println(s2);


        Supplier<ArrayList<String>> aa1 = ArrayList<String>::new;
        ArrayList<String> a1 = aa1.get();
        System.out.println(aa1);
        System.out.println(a1);


        // Consumer<T>, (T), void accept
        // BiConsumer<T,U>, (T, U), void accept

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = (x)->System.out.println(x);
        c1.accept("Annie");
        c1.accept("Annie");


        Map<String,Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k,v)->map.put(k,v);

        b1.accept("chiken", 7);
        b2.accept("chik", 1);

        System.out.println(map);

        Map<String,String> map1 = new HashMap<>();
        BiConsumer<String, String> b11 = map1::put;
        BiConsumer<String, String> b22 = (k,v)->map1.put(k,v);

        b11.accept("chiken", "Cluck");
        b22.accept("chik", "Tweep");

        System.out.println(map1);


        // Predicate<T>, (T), boolean  test
        // BiPredicate<T,U>, (T, U), boolean test

        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = (x)->x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String, String> bb1 = String::startsWith;
        BiPredicate<String, String> bb2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(bb1.test("chicken","chick"));
        System.out.println(bb2.test("chicken","chick"));

        // Function<T,R>, (T), R  apply
        // BiFunction<T,U,R>, (T, U), R apply

        Function <String, Integer> f1 = String::length;
        Function <String, Integer> f2 = x->x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

        BiFunction <String, String, String> bbb1 = String::concat;
        BiFunction <String, String, String> bbb2 = (string, toAdd) ->string.concat(toAdd);
        System.out.println(bbb1.apply("str1","str2"));
        System.out.println(bbb2.apply("str1","str2"));


        // UnaryOperator<T>, (T), T  apply
        // BinaryOperator<T>, (T, T), T apply

        UnaryOperator<String> st1 = String::toUpperCase;
        UnaryOperator<String> st2 = str->str.toUpperCase();

        System.out.println(st1.apply("chirp"));
        System.out.println(st2.apply("chirp"));

        BinaryOperator<String> st11 = String::concat;
        BinaryOperator<String> st22 = (str1, str2)->str1.concat(str2);

        System.out.println(st11.apply("chirp","chirp"));
        System.out.println(st22.apply("chirp","second"));


    }


}
