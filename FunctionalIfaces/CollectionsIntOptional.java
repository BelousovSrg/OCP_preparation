package one;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;


public class CollectionsIntOptional implements Comparable<String>  {

    public String name = "Classname";
    public static void main(String[] args) throws Exception{
        List<String> ls1 = new ArrayList<>();
        ls1.add("string 1");
        ls1.add("string 2");
        ls1.add("string 2");

        List<String> q1 = new LinkedList<>();
        q1.add("string 1");
        q1.add("string2");


        Set<String> s1 = new HashSet<>();
        s1.add("string 1");
        s1.add("string 2");

        Set<String> s2 = new TreeSet<>();
        s1.add("String 1");
        s1.add("String 2");


        Queue<String> q2 = new ArrayDeque<>();
        q2.add("string 1");
        q2.add("string 2");

        Map<String, String> m1 = new TreeMap<>();
        m1.put("string 1", "string2");

        Map<String,String> m2=new HashMap<>();
        m2.put("string1","string 2");


        Comparator<String> q3 = new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };

        Comparator<String> q4 = (x,y)->x.length()-y.length();


        Supplier<LocalDate> sd = LocalDate::now;

        Consumer<String> c1 = System.out::println;
        BiConsumer<String,String> bc1 = String::concat;

        Predicate<String> p1 = String::isEmpty;
        BiPredicate<String,String> bp1 = (x,y)->x.length()<y.length();

        Function<String,Integer> f1 = String::length;
        BiFunction<String,String,Integer> f2 = (x,y)->x.length()+y.length();

        UnaryOperator<String> u1 = (s)->s+"old";
        BinaryOperator<String> bu2 = String::concat;

        Optional<String> os = Optional.of("Hello string");
        Optional<String> osEm = Optional.empty();
        os.ifPresent(System.out::println);
        os.ifPresent((x)->System.out.println(x+" last part"));

        System.out.println(os.isPresent());

        System.out.println(osEm.orElse("No value"));
        System.out.println(osEm.orElseGet(()->"String free"));
        //System.out.println(osEm.orElseThrow(Exception::new));


    }

    public int compareTo(String s1)
    {
        return this.name.compareTo(s1);
    }


}
