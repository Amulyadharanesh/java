public class Dog {
    String name;
    int age;
    String breed;
    boolean isHungry;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isHungry = true;
    }

    public void bark() {
        System.out.println("Dumpy is barking!");
    }

    public void eat() {
      System.out.println( "Dumpy is eating.");
            }

    public void sleep() {
        System.out.println( "Dumpy is sleeping.");
    }

    public void displayDetails() {
        System.out.println("Dog Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Hungry: " + isHungry);
       
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Dumpy", 3, "Labrador");

        myDog.bark();
        myDog.eat();
        myDog.sleep();

        myDog.displayDetails();
    }
}
