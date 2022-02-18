package Syntax.Task06.Solution0610;

/*Перед тобой программа, которая выводит информацию о человеке в консоли. К сожалению, она не компилируется.
        Измени минимальное необходимое количество модификаторов доступа в классе Person, чтобы код скомпилировался.*/

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }
}

