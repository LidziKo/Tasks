package syntax.task11.solution1109;

/* 
Requirements:
1. В методе main класса Solution должен быть создан объект класса Inner.
2. В методе main класса Solution должен быть создан объект класса Nested.
3. Класс Outer изменять нельзя.
*/

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }

    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
