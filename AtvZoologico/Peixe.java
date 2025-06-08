package AtvZoologico;

public class Peixe extends Animal implements Aquatico {
    @Override
        public void emitirSom(){
            System.out.println("O peixe sla");
        }
    @Override
        public void Alimentar(){
            System.out.println("O peixe está comendo");
        }
    @Override
        public void nadar(){
            System.out.println("O peixe nada");
        }
}
