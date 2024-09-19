// questão 5: Polimorfismo - Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.

package questao5;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void som() {
        System.out.println("Animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("Cachorro faz: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void som() {
        System.out.println("Gato faz: Miau!");
    }
}

public class Main {
    public static void emitirSons(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.som();
        }
    }

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        emitirSons(animais);
    }
}
