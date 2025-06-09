package AtvVeiculos;

public class Bicicleta extends Veiculo{

public Bicicleta(String modelo, int ano) {
    super(modelo, ano);
    }

@Override
public void alugar() {
    System.out.println("Bicicleta Elétrica: "+modelo +" alugada");
    }
public void carregar() {
    System.out.println("Carregando a bateria da bicicleta" + modelo);
    }
}