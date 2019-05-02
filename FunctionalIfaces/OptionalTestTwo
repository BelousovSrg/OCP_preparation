package one;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalTestTwo {


    public static void main(String[] args) {

        Optional<Integer> opt1 = Optional.of(150);
        Optional<Integer> opt2 = Optional.empty();

        System.out.println(opt1.get());
        //System.out.println(opt2.get());

        opt1.ifPresent(x->System.out.println(x*2));
        opt2.ifPresent(x->System.out.println(x*3));// does nothing

        System.out.println(opt1.isPresent());
        System.out.println(opt2.isPresent());

        System.out.println(opt1.orElse(10));
        System.out.println(opt2.orElse(10));

        System.out.println(opt1.orElseGet(()->4580));
        System.out.println(opt2.orElseGet(()->4580));

        System.out.println(opt1.orElseThrow(()->new NoSuchElementException()));
        //System.out.println(opt2.orElseThrow(()->new NoSuchElementException()));

    }

    public static Optional<Double> average (int ... scores)
    {

    if(scores.length==0) { return Optional.empty();}

    int sum = 0;
    for(int score: scores)
        {
        sum+=score;
        }
    return Optional.of((double) sum/scores.length);
    }







}
