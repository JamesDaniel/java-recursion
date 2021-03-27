import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static int CHARACTERSS_PER_LINE = 12;
    public static List<Integer> threes = new ArrayList();

    public static void main(String[] args) {
//        Scanner sc = new Scanner("1 2 3 4 5 6");
        Scanner sc = new Scanner(System.in);
        multipleThree(sc);

//        threes.stream().forEach(e -> {
//            System.out.println(e);
//        });
        System.out.println(threes);
    }

    public static String rightAlign(String str) {
        if (str.length() == CHARACTERSS_PER_LINE) {
            return str;
        }
        return rightAlign(" " + str);
    }

    public static int nextMultipleOf5From(int num) {
        if (num % 5 == 0) {
            return num;
        }
        return nextMultipleOf5From(num + 1);
    }

    public static void multipleThree(Scanner sc) {
//        if (!sc.hasNext()) {
//            return;
//        }
        int value = sc.nextInt();
        if (value == -1) {
            return;
        }

        if ((value % 3) == 0) {
            threes.add(value);
            System.out.println(value);
        }
        multipleThree(sc);
    }
}
