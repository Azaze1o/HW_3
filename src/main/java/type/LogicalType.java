package type;

public class LogicalType {
    public static void main(String[] args) {
        int value = Integer.MAX_VALUE-1;
        for(int i = 0; i < 4; i++, value++) {
            System.out.println(value);
        }

        int a = 16;
        int b = 19;

        double x = 1.8;
        double y = 3.1;


        System.out.println(a * y);
        System.out.println(b + x);
        System.out.println(b / y);
        System.out.println(b - a);
    }
}
