package ss3_array.thuc_hanh;

public class DemoMethod {
    public static void main(String[] args) {
        showMessage("Hello World");
        showMessage2("Hello World 2");
    }

    public static void showMessage(String msg) {
        System.out.println(msg);
    }

    static void showMessage2(String msg) {
        System.out.println(msg);
    }

    void sum1(int a, int b) {
        System.out.println(a + b);
    }

    int sum2(int a, int b) {
        return a + b;
    }

    /*
    Cú pháp:
    AccessModifier static/none-static ReturnType MethodName ( list of params ) {}
     */
}
