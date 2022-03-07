package syntax.task07;

/*В методе main вызови метод div() 2 раза.
        Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity".*/

public class Solution0705 {
    public static void main(String[] args) {
        div(0.0, 100.0);
        div(0.0, -100.0);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
