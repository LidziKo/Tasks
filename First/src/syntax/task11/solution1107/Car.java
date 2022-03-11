package syntax.task11.solution1107;

/* 
Requirements:
1. В классе Car нужно создать внутренний класс (inner class) Engine.
2. В классе Engine должно существовать приватное поле isRunning типа boolean.
3. В классе Engine должен существовать публичный метод void start, который устанавливает значение true полю isRunning.
4. В классе Engine должен существовать публичный метод void stop, который устанавливает значение false полю isRunning.
5. В классе Car должно существовать поле engine типа Engine.
*/

public class Car {
    Engine engine;

    public class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }

}
