package one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class C1890 {

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("j", "a", "v","a");

        String word = letters.stream().reduce("",(a,b)->a.concat(b));
        System.out.println(word);

        String word1 = letters.stream().collect(Collectors.joining());
        System.out.println(word1);

        String word2 = letters.stream().collect(Collectors.groupingBy(a->"")).toString();
        System.out.println(word2);

    }
}
