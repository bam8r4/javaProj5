import java.util.*;

public class LivingThings {

     public static void main(String[] args)
    {
        System.out.println("Hello, this is the Living Things information page.\n");

        Set<Animal> animals = new HashSet<Animal>();
        animals.add(new Animal("Dog"));
        animals.add(new Animal("Cat"));

        Set<Plant> plants = new HashSet<Plant>();
        plants.add(new Plant("Potato"));
        plants.add(new Plant("Carrot"));

        Set<Fungi> fungi = new HashSet<Fungi>();
        fungi.add(new Fungi("Ascomycota"));
        fungi.add(new Fungi("Basidiomycota"));

        System.out.println("Animal Information:");
        animals.forEach(System.out::println);
        System.out.println("");

        System.out.println("Plant Information:");
        plants.forEach(System.out::println);
        System.out.println("");

        System.out.println("Fungi Information:");
        fungi.forEach(System.out::println);
        System.out.println("");

        System.out.println("This concludes our informational material.");

    }
}
