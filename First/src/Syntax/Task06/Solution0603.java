package Syntax.Task06;

/*Переименуй параметры метода printPersonInfo():
        firstName в name;
        lastName в surname;
        favouriteDish в meal;
        таким образом, чтобы функционал программы остался неизменным.
        Имена переменных в методе main() оставь без изменений.*/

public class Solution0603 {
    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Любимое блюдо: " + meal);
    }
}
