import java.io.Serializable;

public class Cat implements Serializable {
    public int age;
    public String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
