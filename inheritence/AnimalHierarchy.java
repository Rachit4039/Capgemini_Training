public class AnimalHierarchy {

    static class Animal {
        protected String name;
        protected int age;

        Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        protected void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        Dog(String name, int age) {
            super(name, age);
        }

        @Override
        protected void makeSound() {
            System.out.println("bark");
        }
    }

    static class Cat extends Animal {
        Cat(String name, int age) {
            super(name, age);
        }

        @Override
        protected void makeSound() {
            System.out.println("meow");
        }
    }

    static class Bird extends Animal {
        Bird(String name, int age) {
            super(name, age);
        }
        @Override
        protected void makeSound() {
            System.out.println("chirp");
        }
    }
    public static void main(String[] args) {
        Animal d = new Dog("dogy", 3);
        Animal c = new Cat("caty", 2);
        Animal b = new Bird("birdy", 1);

        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}
