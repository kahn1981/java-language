package cn.dl.studio.kahn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    private List<String> lstString;

    private void initList() {
        lstString = new ArrayList<>();

        lstString.add("a");
        lstString.add("bb");
        lstString.add("ccc");
        lstString.add("dddd");
        lstString.add("eeeee");
        lstString.add("ffffff");
    }

    public void getStrByLen(int len) {
        if (lstString == null) {
            initList();
        }

        Stream<String> stream1 = lstString.stream().filter(str -> str.length() == len);

        System.out.println(stream1.collect(Collectors.joining(",")).toString());
    }
}
