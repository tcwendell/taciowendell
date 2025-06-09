package AtvVeiculos;

public class Carro extends Veiculo implements Motorizado {

public Carro(String modelo, int ano){
    super(modelo, ano);
    }

@Override
public void alugar(){
    System.out.println("Carro: "+modelo+"("+ano+") alugado");
    }

@Override
public void abastecer(){
    System.out.println("Abastecendo o carro "+modelo+"");
    }
}

