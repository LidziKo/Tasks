package syntax.task04;
import java.util.Scanner;

/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
        Вывести на экран полученную сумму и завершить программу.
*/
public class Solution0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean exit = false;

        while (!exit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            }
            else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("ENTER")) {
                    exit = true;
                    System.out.println(sum);
                }
            }
        }
    }
}
