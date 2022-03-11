package syntax.task11.solution1106;

/* 
Requirements:
1. Поле modelName класса Car должно быть не статическим.
2. Должны быть исправлены геттер и сеттер для поля modelName.
*/

public class Car {
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
