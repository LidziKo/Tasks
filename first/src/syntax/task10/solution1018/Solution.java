package syntax.task10.solution1018;

/* 
Requirements:
1. В классе Coordinate должно быть два приватных не статических поля x, y типа int.
2. В классе Coordinate должен быть геттер getX для поля x.
3. В классе Coordinate должен быть геттер getY для поля y.
4. В классе Coordinate должен быть сеттер setX(int) для поля x.
5. В классе Coordinate должен быть сеттер setY(int) для поля y.
6. Сеттеры должны инициализировать соответствующие поля.
*/

public class Solution {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
