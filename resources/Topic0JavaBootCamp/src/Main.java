import com.globant.bootcamp.abstracts.Animal;
import com.globant.bootcamp.animals.Cat;
import com.globant.bootcamp.animals.Dog;
import com.globant.bootcamp.animals.Duck;
import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.animals.Chicken;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        Chicken gallina = new Chicken(Gender.FEMALE);
        gallina.makeSound();

        Duck pato = new Duck(Gender.MALE);

        Dog doggo = new Dog(Gender.MALE);

        Cat cat = new Cat(Gender.FEMALE);

        animals[0] = gallina;
        animals[1] = pato;
        animals[2] = doggo;
        animals[3] = cat;

        Main.singAnimals(animals);
    }

    private static void singAnimals(Animal[] animalBox){
        for(Animal animal : animalBox){
            animal.makeSound();
            System.out.println(animal.getGender());
            System.out.println("-----------------");
        }
    }
}
