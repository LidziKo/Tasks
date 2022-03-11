package syntax.task11.solution1109;

/* 
Requirements:
1. В методе main класса Solution должен быть создан объект класса Inner.
2. В методе main класса Solution должен быть создан объект класса Nested.
3. Класс Outer изменять нельзя.
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested();
        Outer.Inner inner = new Outer().new Inner();
    }
}
