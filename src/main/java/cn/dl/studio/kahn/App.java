package cn.dl.studio.kahn;

import cn.dl.studio.kahn.genericity.cls.Animal;
import cn.dl.studio.kahn.genericity.cls.Bird;
import cn.dl.studio.kahn.genericity.cls.Dog;
import cn.dl.studio.kahn.genericity.genericitycls.GenA;
import cn.dl.studio.kahn.stream.StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // loopDemo();

        // StreamDemo streamDemo = new StreamDemo();
        // streamDemo.getStrByLen(4);

        GenA genA = new GenA();

        List<Animal> lst = new ArrayList<>();

        lst.add(new Dog());
        lst.add(new Bird());
        System.out.println(genA.countLegs(lst));
    }

    private static void loopDemo() {
        // String[] params = new String[]{"1", "2", "3", "4", "5"};
        // //增强for循环对象为数组
        // for (String str : params) {
        //     System.out.println(str);
        // }

        List<String> lists = Arrays.asList("1", "2", "3", "4", "5");
        //增强for循环对象实现Iterable接口
        for (String str : lists) {
            System.out.println(str);
            if (str == "3") {

            }
            if (str.equals("3")) {
                //lists.remove(str);
            }

            switch (str) {
                case "A":
                    break;
                case "B":
                    break;
                case "C":
                    break;
            }
        }


    }
}
