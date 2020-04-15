package app;

public class Exercise_112 {

    public static void main(String[] args) {
        String cache = "";
        String actual = "";
        for (int i = 0; i <= 99999; i++) {
            cache = Integer.toString(i);
            for (int ii = 0; ii < cache.length(); ii++) {
                if (cache.charAt(ii) == '3') {
                    actual += 'E';
                } else {
                    actual += cache.charAt(ii);
                }
            }
            switch (actual.length()) {
                case 1:
                    actual = "0000" + actual;
                    break;
                case 2:
                    actual = "000" + actual;
                    break;
                case 3:
                    actual = "00" + actual;
                    break;
                case 4:
                    actual = "0" + actual;
                    break;
            }
            System.out.println(actual);
            actual = "";
        }
    }
}