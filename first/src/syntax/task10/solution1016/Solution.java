package syntax.task10.solution1016;

/*Requirements:
        1. Не изменяй класс City.
        2. В классе Solution должен быть метод showWeather с параметром City.
        3. Метод showWeather должен использовать геттеры класса City.
        4. Метод showWeather должен выводить текст в консоли в соответствии условию.*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        City dubai = new City("Дубаи", 40);
        showWeather(dubai);
    }
}
