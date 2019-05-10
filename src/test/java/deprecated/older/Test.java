package deprecated.older;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().roundSum(16, 17, 18));
    }

    /**
     * Count subStrings in a string.
     *
     * @param str String
     * @param sub Substring
     * @return How many times sub appears in str.
     */
    public static int count(String str, String sub) {
        if (str == null || sub == null || str.isEmpty() || sub.isEmpty()) return 0;
        return (str.length() - str.replace(sub, "").length()) / sub.length();
    }

    public int roundSum(int a, int b, int c) {
        if (getFirstDigit(a) >= 5) a = round(a, 1);
        if (getFirstDigit(b) >= 5) b = round(b, 1);
        if (getFirstDigit(c) >= 5) c = round(c, 1);

        return a + b + c;
    }

    public int round(int num, int place) {
        double multiplier = Math.pow(10, place);
        return (int) (Math.round((double) num / multiplier) * multiplier);
    }

    public int getFirstDigit(int num) {
        return num % 10;
    }
}
