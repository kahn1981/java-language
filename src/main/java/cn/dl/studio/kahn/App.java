package cn.dl.studio.kahn;

import cn.dl.studio.kahn.genericity.cls.Animal;
import cn.dl.studio.kahn.genericity.cls.Bird;
import cn.dl.studio.kahn.genericity.cls.Dog;
import cn.dl.studio.kahn.genericity.genericitycls.GenA;
import cn.dl.studio.kahn.stream.StreamDemo;

import java.security.MessageDigest;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // loopDemo();

        // StreamDemo streamDemo = new StreamDemo();
        // streamDemo.getStrByLen(4);

        //--------------------------------------------------------
        // GenA genA = new GenA();
        //
        // List<Animal> lst = new ArrayList<>();
        //
        // lst.add(new Dog());
        // lst.add(new Bird());
        // System.out.println(genA.countLegs(lst));


        //--------------------------------------------------------
        // TestMessageDigest();

        //--------------------------------------------------------
        // TestTimeStamp();

        //--------------------------------------------------------
        // RandomTest();

        //--------------------------------------------------------
        MessUpNumber();

        //--------------------------------------------------------
        //--------------------------------------------------------
        //--------------------------------------------------------
        //--------------------------------------------------------

    }

    private static void MessUpNumber() {
        String NumberArray[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        StringBuilder sb = new StringBuilder("");

        Random random = new Random(System.nanoTime());
        for (int i = 0; i < 5; i++) {
            NumberArray = reserveNumber(new Random(System.nanoTime()), NumberArray.clone());
            System.out.println(String.join("", NumberArray));
        }
    }

    private static String[] reserveNumber(Random random, String NumberArray[]) {
        for (int i = 0; i < NumberArray.length; i++) {
            int currentRandom = random.nextInt(NumberArray.length);
            String current = NumberArray[i];
            NumberArray[i] = NumberArray[currentRandom];
            NumberArray[currentRandom] = current;
        }

        return NumberArray.clone();
    }

    private static void RandomTest() {
        System.out.println("Random不设置种子：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + random.nextInt(100) + ", ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------------------");

        System.out.println("Random设置种子：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            random.setSeed(100);
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + random.nextInt(100) + ", ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------------------");

        int ran;
        System.out.println("Random设置nanotime种子：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random(System.nanoTime());
            // random.setSeed(100);
            for (int j = 11; j > 7; j--) {
                ran = random.nextInt(j);
                System.out.print(" " + ran + ", ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < 5; i++) {
            Random random = new Random(System.nanoTime());
            // random.setSeed(100);
            for (int j = 11; j > 7; j--) {
                ran = random.nextInt(j);
                System.out.print(" " + ran + ", ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < 5; i++) {
            Random random = new Random(System.nanoTime());
            // random.setSeed(100);
            for (int j = 11; j > 7; j--) {
                ran = random.nextInt(j);
                System.out.print(" " + ran + ", ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < 5; i++) {
            Random random = new Random(System.nanoTime());
            // random.setSeed(100);
            for (int j = 11; j > 7; j--) {
                ran = random.nextInt(j);
                System.out.print(" " + ran + ", ");
            }
            System.out.println("");
        }
    }

    private static void TestTimeStamp() {
        System.out.println(System.currentTimeMillis());

        // 获得当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        // 将当前时间转为时间戳
        long second = localDateTime.toEpochSecond(ZoneOffset.ofHours(8));

        System.out.println(second);

        // 获得当前时间
        // LocalDateTime localDateTime = LocalDateTime.now();
        // 将当前时间转为时间戳
        long milliseconds = localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();

        // 1580707268
        System.out.println(milliseconds);
        System.out.println(milliseconds / 1000);

        System.out.println(System.currentTimeMillis());

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

    private static void TestMessageDigest() {
        byte[] bytes = generatePwd("SHA-256", "realm-pwd");

        String s = byteArrayToHexStr(bytes);

        //Check converted string against original String
        System.out.println("Decoded String : " + s.replace("0x", "").replace(",", ""));

        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bytes) {
            //每个字节转与0xff（1111 1111）按位与，得到这个字节的补码
            String hex = Integer.toHexString(b & 0xff);
            //如果生成的16进制的字符的长度是1，那么需要在前面补0，比如
            //0,5,10,13,15的16进制分别是是0，5，a,d,f，长度只有1，所以需要前面补0
            if (hex.length() == 1) {
                hex = "0" + hex;
            }
            stringBuilder.append(hex);
        }

        System.out.println(String.format("hex-encode is %s", stringBuilder.toString()));

        System.out.println(String.format("hex-encode is %s", bytesToHex(bytes)));
    }

    private static byte[] generatePwd(String algorithm, String string) {
        MessageDigest digestPass = null;

        try {
            digestPass = MessageDigest.getInstance(algorithm);
            return digestPass.digest(string.getBytes("UTF-8"));
        } catch (Exception e) {
            //return new byte[]{'b', 'a', '3', '2', '5', '3', '8', '7', '6', 'a', 'e', 'd', '6', 'b', 'c', '2', '2', 'd', '4', 'a', '6', 'f', 'f', '5', '3', 'd', '8', '4', '0', '6', 'c', '6', 'a', 'd', '8', '6', '4', '1', '9', '5', 'e', 'd', '1', '4', '4', 'a', 'b', '5', 'c', '8', '7', '6', '2', '1', 'b', '6', 'c', '2', '3', '3', 'b', '5', '4', '8', 'b', 'a', 'e', 'a', 'e', '6', '9', '5', '6', 'd', 'f', '3', '4', '6', 'e', 'c', '8', 'c', '1', '7', 'f', '5', 'e', 'a', '1', '0', 'f', '3', '5', 'e', 'e', '3', 'c', 'b', 'c', '5', '1', '4', '7', '9', '7', 'e', 'd', '7', 'd', 'd', 'd', '3', '1', '4', '5', '4', '6', '4', 'e', '2', 'a', '0', 'b', 'a', 'b', '4', '1', '3'};
            return new byte[]{-49, 81, 68, 77, 20, 38, 126, -105, -7, -121, -70, 41, 22, -120, 49, -74, -56, 62, 94, -116, -21, 73, -47, -13, 114, 53, 102, -31, -59, 43, -94, 71, 63, -111, -120, -41, -108, -74, -39, 70, 122, -31, -59, -64, 33, 53, -55, 8, 52, -11, 9, 100, -46, 68, -119, 65, 66, 21, -77, 21, 118, -50, -30, -64};
        }
    }

    public static String byteArrayToHexStr(byte[] byteArray) {
        if (byteArray != null && byteArray.length != 0) {
            StringBuilder sb = new StringBuilder();
            char[] hexArray = "0123456789ABCDEF".toCharArray();

            for (int j = 0; j < byteArray.length; ++j) {
                int v = byteArray[j] & 255;
                sb.append("0x").append(hexArray[v >>> 4]).append(hexArray[v & 15]);
                if (j != byteArray.length - 1) {
                    sb.append(",");
                }
            }

            return sb.toString();
        } else {
            return null;
        }
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        char[] hexArray = "0123456789ABCDEF".toCharArray();

        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);


    }
}