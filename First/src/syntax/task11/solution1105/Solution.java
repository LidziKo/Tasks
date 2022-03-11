package syntax.task11.solution1105;

/* 
Requirements:
1. Объявление и инициализацию полей класса Window изменять нельзя.
2. Метод changeSize класса Window должен изменять значения полей класса согласно переданным данным.
3. Объявление метода changeSize и названия параметров изменять нельзя.
*/

public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
