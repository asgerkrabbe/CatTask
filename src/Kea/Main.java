package Kea;

public class Main {

    public static void main(String[] args) {
        Cat oscar = new Cat();
        Cat luna = new Cat();

        oscar.catTemp("Oscar","Male",3,7,"Brown","Striped");
        luna.catTemp("Luna","Female",2,5,"Gray","Plain");

        System.out.println(luna + "" + oscar);
    }
}