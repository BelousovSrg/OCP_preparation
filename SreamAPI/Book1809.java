package one;

import java.util.Arrays;
import java.util.List;

public class Book1809 {


    private String title;
    private double price;
    public Book1809(String title, double price)
    {
        this.title = title;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public static void main(String[] args)
    {

        List<Book1809> books = Arrays.asList(
                new Book1809("Thinking in Java", 30.0),
                new Book1809("Java in 24 hrs", 20.0),
                new Book1809("Java Recipies", 10.0));


        double avergaePrice = books.stream().filter(b->b.getPrice()>10)
                .mapToDouble(b->b.getPrice())
                .average().orElse(0.0);

        System.out.println(avergaePrice);



    }

}
