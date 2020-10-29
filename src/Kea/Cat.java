package Kea;

public class Cat {

    private String name;
    private String sex;
    private int age;
    private int weight;
    private String color;
    private String texture;

    public void catTemp(String name, String sex, int age, int weight, String color, String texture){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return  "Name = " + name +
                "\nSex = " + sex +
                "\nAge = " + age +
                "\nWeight = " + weight +
                "\nColor = " + color +
                "\nTexture = " + texture + "\n";
    }
}
