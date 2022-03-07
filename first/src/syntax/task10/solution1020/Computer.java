package syntax.task10.solution1020;

/*
Requirements:
        1. В отдельных файлах должны быть публичные классы Computer, Keyboard, Monitor, Mouse, SystemUnit.
        2. В конструкторе класса Computer нужно создать 4 объекта разных "комплектующих".
*/

public class Computer {
    public Computer() {
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        SystemUnit systemUnit = new SystemUnit();
    }
}
