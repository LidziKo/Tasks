package syntax.task10.solution1021;

/* 
Requirements:
1. В классе Car должно быть приватное поле model типа String.
2. В классе Car должно быть приватное поле year типа int.
3. В классе Car должно быть приватное поле color типа String.
4. В классе Car не нужно объявлять какие-либо конструкторы.
5. В классе Car должен быть не статический метод public void initialize с параметрами типа String, int, String.
6. Инициализация полей model, year, color должна производиться в методе initialize(String model, int year, String color).
*/

public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
