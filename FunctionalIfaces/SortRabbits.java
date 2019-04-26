import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortRabbits {

    static class Rabbit
    {
        int id; String name;

        Rabbit(int id, String name)
        {
        this.id=id;
        this.name=name;
        }

        public String getName(){ return this.name;}
        public int getId(){ return this.id;}

        public static int compareByName(Rabbit r1, Rabbit r2)
        {
        return r1.getName().compareTo(r2.getName());
        }

        @Override public String toString()
        {
        return name;
        }

    }

    public static void main(String[] args)
    {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(1,"Aone"));
        rabbits.add(new Rabbit(3,"Btwo"));
        rabbits.add(new Rabbit(2,"Cthree"));

        Comparator<Rabbit> c1ByNameRevers = new Comparator<Rabbit>()
        {
        @Override
        public  int compare(Rabbit r1, Rabbit r2)
            {
            return r2.name.compareTo(r1.name);
            }

        };

        Comparator<Rabbit> c2ById = (r1, r2) -> r2.id - r1.id;
        Comparator<Rabbit> c3ByName = Rabbit::compareByName;

        Collections.sort(rabbits, c3ByName);
        //Collections.sort(rabbits, c2ById);
        //Collections.sort(rabbits, c1ByNameRevers);
        System.out.println(rabbits);
    }
}
