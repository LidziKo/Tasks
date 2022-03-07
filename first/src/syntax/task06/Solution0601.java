package syntax.task06;

/*Создай public static void printHydrogenInfo() метод, который должен выводить все строки о водороде.
        Также создай public static void printJavaInfo() метод, который будет выводить все строки об острове Ява.
        Наконец, в методе main() вызови эти два метода.
        Общий вывод в консоли не должен измениться.*/

public class Solution0601 {
    public static void main(String[] args) {
        printHydrogenInfo();
        printJavaInfo();
    }

    public static void printHydrogenInfo() {
        System.out.println("Водород:");
        System.out.println("Это химический элемент периодической системы с обозначением H и атомным номером 1.");
        System.out.println("Является самым легким элементом таблицы.");
        System.out.println("Водород применяется в:");
        System.out.println("-Химической промышленности;");
        System.out.println("-Нефтеперерабатывающей промышленности;");
        System.out.println("-Авиации;");
        System.out.println("-Электроэнергетике.");
    }

    public static void printJavaInfo() {
        System.out.println("Остров Ява:");
        System.out.println("Входит в состав Индонезии.");
        System.out.println("На острове зародились государства Матарам, Маджапахит, Демак.");
        System.out.println("Ява является самым населенным островом в мире:");
        System.out.println("Общее население — 140 млн. человек.");
        System.out.println("Плотность населения — 1061 чел/км.кв.");
        System.out.println("Здесь производят один из знаменитых сортов кофе — Копи Лювак.");
    }
}
