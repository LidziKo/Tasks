package syntax.task12;

import java.util.ArrayList;

/* 
Requirements:
1. Метод paySalary(String) должен добавлять в список alreadyGotSalaryEmployees имя сотрудника, если он есть в списке waitingEmployees.
2. Метод paySalary(String) должен заменять имя сотрудника на значение null, если он есть в списке waitingEmployees.
3. Метод paySalary(String) не должен изменять списки waitingEmployees и alreadyGotSalaryEmployees, если переданного имени нет в списке waitingEmployees.
4. Если в метод paySalary(String) передается null, метод не должен добавлять это значение в waitingEmployees или alreadyGotSalaryEmployees.
*/

public class Solution1209 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Гвинно");
        System.out.println(waitingEmployees);
        System.out.print(alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int element = waitingEmployees.indexOf(name);
            waitingEmployees.set(element, null);
        }
    }
}
