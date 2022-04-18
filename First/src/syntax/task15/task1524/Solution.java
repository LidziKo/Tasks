package syntax.task15.task1524;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try {
            Scanner scanner = new Scanner(System.in);
            FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
            FileOutputStream fileOutputStream = new FileOutputStream(scanner.nextLine());

            byte[] arrayIn = fileInputStream.readAllBytes();
            byte[] arrayOff = new byte[arrayIn.length];

            for (int i = 0; i < arrayIn.length; i += 2) {
                if (i < arrayIn.length - 1) {
                    arrayOff[i] = arrayIn[i + 1];
                    arrayOff[i + 1] = arrayIn[i];
                } else {
                    arrayOff[i] = arrayIn[i];
                }
            }
            fileOutputStream.write(arrayOff);

            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}