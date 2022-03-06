package Syntax.Task10.Solution1012;

/*Если удалить некоторые элементы, то в массиве появятся так называемые "дыры" - то есть элементы равные null.
        Метод executeDefragmentation(String[]), принимающий массив строк, выполняет его "дефрагментацию",
        то есть перемещает все объекты в начало массива в таком же порядке, передвинув все "дыры"
        (элементы равные null) в конец массива. В этой задаче тебе нужно реализовать метод executeDefragmentation(String[]).
        Метод main() можешь использовать для проверки результата работы метода executeDefragmentation(String[]).

        Requirements:
        1. В классе Memory должен быть метод public static void executeDefragmentation(String[]).
        2. Реализуй метод executeDefragmentation(String[]) согласно условию.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {

    }
}
