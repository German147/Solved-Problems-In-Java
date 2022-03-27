package com.TAUchapters.chapter_10_Polymorphism;

public class Zoo {
    public static void main(String[] args) {

        Dog coco = new Dog();
        System.out.println("Hi, I am Sasha the dog and I can");
        coco.fetch();
        coco.makeSound();
        feed(coco);
        System.out.println("\n");
        System.out.println("Here Polymorphism comes");
        System.out.println("Sasha is instantiated as type of Dog Animal class");
        //here sasha inherits all methods of an animal class, but it will call first
        //the dog method because it is instanciated as type of Dog Animal class
        Animal sasha = new Dog();
        sasha.makeSound();
        sasha.makeSound();
        feed(sasha);
        System.out.println("\n");
        System.out.println("Here we change sasha from the type dog to type Cat");
        System.out.println("Now sasha can make the cats sound \n");
        //now lets change this object sasha and isntantiate as a type of Cat Animal Class
        sasha = new Cat();
        sasha.makeSound();
/*now, the scrat() is only in Cat class, so as sasha is instantiated as an Animal, it does't have
* access to the method of the subclass, but only casting to this subclass*/
        ((Cat) sasha).scratch();
        feed(sasha);
    }
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Here the Dog food");
        }else if (animal instanceof Cat){
            System.out.println("He is the Cat food");
        }
    }
}
