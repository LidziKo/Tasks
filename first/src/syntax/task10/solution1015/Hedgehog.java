package syntax.task10.solution1015;

/*Requirements:
        1. В классе Hedgehog должен существовать вложенный класс public static class Apple.
        2. В классе Hedgehog должен существовать не статический, публичный void метод eat(Apple).
        3. В методе main должен быть создан один объект класса Apple.
        4. В методе main должен быть создан один объект класса Hedgehog.
        5. В методе main у объекта класса Hedgehog нужно вызвать метод eat и передать созданный объект класс Apple.*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Hedgehog hedgehog = new Hedgehog();
        Apple apple = new Apple();
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
