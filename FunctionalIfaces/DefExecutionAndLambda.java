package one;

interface LamIface{

    String move();
}
public class DefExecutionAndLambda
{

    String walk = "walk";

    void everyonePlay(boolean baby)
    {

        String approach = "amble";
        play(() -> walk);
        play(() -> baby ? "hitch a ride": "run");
        play(() -> approach);

    }

    public static void main(String[] args) {

        DefExecutionAndLambda fd = new DefExecutionAndLambda();
        fd.everyonePlay(false);
    }

    void play(LamIface g)
    {
        System.out.println(g.move());
    }


}
