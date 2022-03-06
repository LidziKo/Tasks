package Syntax.Task10.Solution1014;

/*Requirements:
        1. Нельзя изменять поле hasEggs класса Market.
        2. В классе Market должен быть статический, публичный void метод makePurchases(boolean).
        3. Если метод makePurchases(boolean) вызывается с аргументом false, то он должен вывести в консоль: "Купил 1 батон".
        4. Если метод makePurchases(boolean) вызывается с аргументом true, то он должен вывести в консоль: "Купил 10 батонов".*/

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }
}
