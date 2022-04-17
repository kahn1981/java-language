package cn.dl.studio.kahn;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        loopDemo();
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
            if (str.equals("3")) {
                lists.remove(str);
            }
        }
    }
}
