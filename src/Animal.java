public class Animal {
    final String species;
    String name;
    Double weight;
    boolean isAlive;

    Animal(String species) {
        this.isAlive = true;
        this.species = species;
    }

    void feed() {
        if (isAlive) {
            this.weight += 0.5;
            System.out.println("dzieki");
        } else {
            System.out.println("póżno");
        }
    }

    void takeForWalk() {
        if (!isAlive) {
            System.out.println("Policja");
        } else {
            this.weight -= 0.5;
            System.out.println("dzieki");
        }
        if (this.weight <= 0) {
            this.isAlive = false;
            this.weight = 0.0;
        }
    }
}
