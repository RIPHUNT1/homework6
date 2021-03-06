public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cats");
        Cat cat = new Cat("Uzhik", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal anemal = new Animal("Dogs");
        Dog dog = new Dog("Leya", 500, 10, 0.5 );
        anemal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
