package questao4;

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
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.som();
        gato.som();
    }
}
