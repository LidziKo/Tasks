package syntax.task10.solution1017;

/*
Requirements:
        1. В отдельных файлах создай публичные классы Africa, Antarctica, Australia, Eurasia, NorthAmerica, SouthAmerica.
        2. В каждом из созданных классов должно быть private final int поле area.
        3. В каждом из созданных классов должен быть публичный конструктор с аргументом типа int, который будет инициализировать поле area.
        4. В методе main класса Earth создай 6 разных материков и передай в них значения площадей.
*/


public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(30_370_000);
        Antarctica antarctica = new Antarctica(14_200_000);
        Australia australia = new Australia(7_692_000);
        Eurasia eurasia = new Eurasia(54_760_000);
        NorthAmerica northAmerica = new NorthAmerica(24_710_000);
        SouthAmerica southAmerica = new SouthAmerica(17_840_000);
    }
}
