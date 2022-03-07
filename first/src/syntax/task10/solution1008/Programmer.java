package syntax.task10.solution1008;
/*
Requirements:
        1. В классе Programmer должно быть не статическое private int поле salary.
        2. В классе Programmer должен быть публичный геттер для поля salary.
        3. В классе Programmer должен быть публичный сеттер для поля salary.
        4. Сеттер должен изменять значение поля salary, только если входящий аргумент больше текущего значения.*/

public class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }
}
