package Syntax.Task06;

/*В классе Solution дан двумерный массив строк (поле array),
        содержащий данные о студентах. В каждой строке первый элемент — это идентификатор студента, второй — его фамилия, третий — имя.
        Необходимо реализовать функционал поиска нужного студента/студентов по любому полю и вывод результата поиска на экран в виде "идентификатор фамилия имя"
        То есть, если пользователь вводит с клавиатуры строку, нужно вывести на экран строку массива, если хотя бы один елемент в этой строке
        полностью совпадает с введенным значением.*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution0626 {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрей"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергей"},
            {"8", "Клочкова", "Елена"},
            {"754", "Котов", "Иван"}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchField = scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j].contains(searchField)) {
                    for (int k = 0; k < array[0].length; k++) {
                        System.out.print(array[i][k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

