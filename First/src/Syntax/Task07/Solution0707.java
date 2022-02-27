package Syntax.Task07;

/*В методе main() измени порядок вызова методов System.out.print()
        таким образом, чтобы вывод на консоль был: "Hello char".*/

public class Solution0707 {
    // eHrolhc la
    public static char char1 = 101; // e
    public static char char2 = 'H'; // H
    public static char char3 = 114; //r
    public static char char4 = '\u006F'; //o
    public static char char5 = 108; //l
    public static char char6 = 'h';  //h
    public static char char7 = 0x0063; // c
    public static char char8 = ' ';
    public static char char9 = 'l';
    public static char char10 = 0x61; //a

    public static void main(String[] args) {
        System.out.print(char2);
        System.out.print(char1);
        System.out.print(char5);
        System.out.print(char5);
        System.out.print(char4);
        System.out.print(char8);
        System.out.print(char7);
        System.out.print(char6);
        System.out.print(char10);
        System.out.print(char3);
        System.out.println();
    }
}
