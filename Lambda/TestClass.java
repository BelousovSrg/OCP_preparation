package one;
import java.util.function.*;

interface AmountValidator{

    public boolean checkAmount(double value);
}

public class TestClass {

    public void updatebelance(double bal)
    {
        boolean isOk = new AmountValidator()
        {
        public boolean checkAmount(double value)
            {
                return value>=0.0;
            }

        }.checkAmount(bal);

        if(isOk) System.out.println("Summ is OK");

    }


    public static void main(String[] args)
    {
   //IntFunction
    TestClass t1 = new TestClass();
    t1.updatebelance(10.0);

    System.out.println(t1.testNew(30));
    }

    public boolean testNew(int a)
    {
        Predicate<Integer> p1= x->x>20;
        return  p1.test(a);
    }
}
