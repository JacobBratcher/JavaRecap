package JavaOOP.PolymorphismDemo;

public class Runner {
    
    public static void main(String[] args) {

        MethodOverLoadingDemo dm = new MethodOverLoadingDemo();

        dm.add(12);
        dm.add(12, 14);

        Dog d1 = new Dog();
        d1.printAnimal();

        Animal an = new Animal();

        an.printAnimal();
        
    }

}
