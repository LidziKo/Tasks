package Syntax.Task10.Solution1001;

/*Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли.
        Для этого тебе нужно вызвать конструктор класса Skyscraper в методе main
        и в теле конструктора вывести в консоль текст "Небоскреб построен.".*/

public class Skyscraper {
    public Skyscraper() {
        System.out.println("Небоскрёб посроен.");
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
    }
}
