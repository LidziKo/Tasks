package syntax.task15.task1525;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/* 
Что-то не копируется...
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scanner.nextLine());
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (fis.available() > 0) {
                int read = fis.read(buffer);
                fos.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}