package Syntax.Task09;

/*Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
        Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.
        Для этого используй метод String.format().*/

public class Solution0916 {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        return String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
    }
}
