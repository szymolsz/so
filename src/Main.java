public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        Animal cat = new Animal("canis");
        dog.name = "Szarik";
        dog.weight = 5.3;
        cat.name = "As";
        System.out.println("Masz zwierzę, nazywa się:");
        System.out.println(dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);
        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.feed();
        Human me = new Human();
        me.pet = new Animal("felis");
        System.out.println(me.pet.species);
        me.pet = dog;
        System.out.println(me.pet.species);
        Car fiat = new Car("Fiat", "bravo");
        me.car = fiat;
        System.out.println(me.car.producer);

    }
}