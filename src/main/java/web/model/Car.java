package web.model;

public class Car {
    private String name;
    private String color;
    private String engine;

    public Car(String name, String color, String engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Model: " + name + ", color: " + color + ", engine: " + engine;
    }
}
