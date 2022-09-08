package cn.dl.studio.kahn;

public class RandomNumeric {
    private final static String NumberArray[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private final static String NumberCollection = "0123456789";

    public static String GenerateRandomNumeric() {
        String result = "";

        int numberIndex = getRandomIndex();

        if (NumberCollection.contains("0")) {
            NumberCollection.replace("0","");
        }
        return result;
    }

    private static int getRandomIndex() {

        return 0;
    }

    public static String GetCheckResult(String src, String dest) {


        return "1A1B";
    }

    private static String messUpTheNumbers(){

        return "";
    }
}
