package syntax.task14.task1418;

/* 
Собственное исключение
*/

import java.util.ArrayList;

public class Solution {
    public static final String message = "Похоже, что у объекта класса Human не инициализирован список детей.";

    public static void main(String[] args) {
        Human amigo = new Human("Amigo", 25, new ArrayList<>());
        System.out.printf("Имя: %s, возраст: %d, количество детей: %d%n", amigo.getName(), amigo.getAge(), getChildrenCount(amigo));

        Human diego = new Human("Diego", 35);
        System.out.printf("Имя: %s, возраст: %d, количество детей: %d%n", diego.getName(), diego.getAge(), getChildrenCount(diego));
    }

    public static int getChildrenCount(Human human) {
        int size;
        try {
            size = human.getChildren().size();

        } catch (NullPointerException e) {
            throw new ChildrenNotInitializedException(message);
        }
        return size;
    }
}
