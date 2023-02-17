package lesson6.t1;

public class Bird {
    int weight;
    int wings;
    int maxFlyingSpeed;
    double maxFlyHeightKm;
    String name;

    public void meBird() {
        System.out.println("Я " + name);
        System.out.println("Мой вес " + weight + " грамм");
        System.out.println("Размах крыльев " + wings + " сантиметров");
        System.out.println("Максимальная скорость полёта " + maxFlyingSpeed + " километров в час");
        System.out.println("Максимальная высота полёта " + maxFlyHeightKm + " километра");
        System.out.println();
    }

    public void iCanFly() {
        System.out.println("Я умею летать.");
    }

    public void iCanWalk() {
        System.out.println("Я умею ходить.");
    }

    public void iCanEat() {
        System.out.println("Я умею есть.");
    }

    public void iLayEggs() {
        System.out.println("Я откладываю яйца.");
    }

    public static void main(String[] args) {
        Bird sparrow = new Bird();
        Bird pigeon = new Bird();

        pigeon.name = "Голубь";
        pigeon.weight = 300;
        pigeon.wings = 60;
        pigeon.maxFlyingSpeed = 100;
        pigeon.maxFlyHeightKm = 2;
        pigeon.meBird();

        sparrow.name = "Воробей";
        sparrow.weight = 100;
        sparrow.wings = 10;
        sparrow.maxFlyingSpeed = 50;
        sparrow.maxFlyHeightKm = 1;

        sparrow.meBird();
        sparrow.iCanFly();
        sparrow.iCanWalk();
        sparrow.iCanEat();
        sparrow.iLayEggs();

    }
}
