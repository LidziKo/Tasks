package syntax.task12.task1212;

/* 
Requirements:
1. В классе CustomStringArrayList должны быть не статические приватные поля int size, int capacity, String[] elements.
2. В классе CustomStringArrayList должен быть конструктор без параметров, который инициализирует поле size значением 0, поле capacity — значением 10, поле elements — новым массивом с размером capacity.
3. В классе CustomStringArrayList должен быть метод public void add(String).
4. В классе CustomStringArrayList должен быть метод private void grow().
5. Метод grow() должен работать согласно условию.
6. Метод add(String) изменять нельзя.
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        String[] newArray = new String[capacity];

        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }

        elements = newArray;
    }

}
