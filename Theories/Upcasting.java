class Animal {
    void makeSound(){
        System.out.println("Animal faz som");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Cachorro late");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); //Upcasting (Dog para Animal)
        animal.makeSound(); //Vai chamar a versão de makeSound() da classe Dog.
    }
}

//Explicação:

//O objeto Dog é tratado como um objeto da classe Animal. A chamada de makesound() invoca a versão sobrescrita do método na classe Dog.
