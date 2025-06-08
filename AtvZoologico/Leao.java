package AtvZoologico;

public class Leao extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O leão ruge: RAWR");
    }

    @Override
    public void Alimentar() {
        System.out.println("O leão está comendo");
    }
}
