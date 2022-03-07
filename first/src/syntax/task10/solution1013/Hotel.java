package syntax.task10.solution1013;

/*Requirements:
        1. Нельзя удалять, изменять или добавлять поля в класс Hotel.
        2. Поля класса Hotel должны находиться в правильном порядке.*/

public class Hotel {
    public int thirdFloor = 3;
    public int fourthFloor = thirdFloor + 1;
    public int fifthFloor = fourthFloor + 1;
    public int sixthFloor = fifthFloor + 1;
}
