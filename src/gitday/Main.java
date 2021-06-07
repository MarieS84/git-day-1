package gitday;

public class Main {

    public static void main(String[] args) {
        method(6);
        System.out.println(method2());

    }

    public static void method(int a) {
        if (a < 5) {
            return;
        }
        System.out.println(a);

    }

    public static double method2() {
        return 55.8;
    }
}






