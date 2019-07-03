package one;

import java.util.*;
import java.util.function.DoubleFunction;

public class TestClass2
{

    Map<String, List<Double>> groupedValues = new HashMap<>(); // список строка => числа



    public void process(String name, Double value) // метод обработки
    {
        List<Double> values = groupedValues.get(name); // выбираем из имеющегося "массива" список чисел по ключу

        if(values==null) // если список пуст то есть если ключа такого нет в мэпе
        {
            values = new ArrayList<Double>(); // осоздаем пустой список
            groupedValues.put(name,values); // добавляем этот пустой список в список объекта
        }

        //values.add(value); // добавляем этот список в список метода но совершенно незачем

    }

    public void process2(String name, Double value)
    {

        groupedValues.computeIfAbsent(name,(a)->new ArrayList<Double>()).add(value);
    }


    public static void main(String[] args) {
        TestClass2 t2 = new TestClass2();

        List<Double> ld1 = Arrays.asList(10.0,20.0,30.0);

        t2.groupedValues.put("Sergey",ld1);
        System.out.println(t2.groupedValues);

        t2.process("Sergey 2",100.0);
        System.out.println(t2.groupedValues);


    }
}
