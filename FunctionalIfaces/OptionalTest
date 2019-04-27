package one;

import java.util.Optional;


public class OptionalTest {


    public  static Optional<Double> average(int ...scores)
    {
        if(scores.length==0){return Optional.empty();}

        int sum = 0;
        for(int score: scores)
        {
        sum +=score;
        }

       return Optional.of((double)sum/scores.length);

    }

    public static void main(String[] args) {
        //System.out.println(average(10,20,30));
        //System.out.println(average( ));
        Optional<Double> opt = average(90,100);
        if(opt.isPresent())
        {
            //System.out.println(opt.get());
        }
        Optional<Double> opt1 = average(40,50,60);
        Optional o = (opt1==null)? Optional.empty():Optional.of(opt1);
        //System.out.println(o.get());
        Optional o1 = Optional.ofNullable(opt1);
        System.out.println(o1.get());

        Optional<Double> opt3 = average(30,50,70);
        opt3.ifPresent(System.out::println);

        Optional<Double> opt4 = average();
        System.out.println(opt4.orElse(Double.NaN));
        //System.out.println(opt4.orElseGet(()->Math.random()));
        //System.out.println(opt4.orElseThrow(()->new IllegalArgumentException()));


        Optional<Double> opt5 = average(90,100);
        System.out.println(opt5.orElse(Double.NaN));
        System.out.println(opt5.orElseGet(()->Math.random()));


    }

}
