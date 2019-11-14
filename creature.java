interface Reproduction
{
    String modeOfReproduction();
}

abstract class Creature {

    abstract String eatFood();

}

class Animal extends Creature implements Reproduction{

    private String identity;

    public Animal(String name) {
        this.identity=name;
    }

    public String eatFood() {
        return "ingestion.";
    }

    public String modeOfReproduction() {
        return "Sexual Reproduction";
    }

    public String toString() {
        return "The "+ identity +" reproduces using " +modeOfReproduction()+ " and it eats using " + eatFood();
    }
}


class Plant extends Creature implements Reproduction{

    private String identity;

    public Plant(String name) {
        this.identity=name;
    }

    public String eatFood() {
        return "sunlight also know as photosynthesis.";
    }

    public String modeOfReproduction() {
        return "Seeds";
    }

    public String toString() {
        return "The "+ identity +" reproduces using " +modeOfReproduction()+ " and it eats using " + eatFood();
    }
}


class Fungi extends Creature implements Reproduction{

    private String identity;

    public Fungi(String name) {
        this.identity=name;
    }

    public String eatFood() {
        return "external digestion with hyphae.";
    }

    public String modeOfReproduction() {
        return "Spores";
    }

    public String toString() {
        return "The "+ identity +" reproduces using " +modeOfReproduction()+ " and it eats using " + eatFood();
    }
}