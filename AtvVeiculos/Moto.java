package AtvVeiculos;

public class Moto extends Veiculo implements Motorizado {

public Moto(String modelo, int ano){
    super(modelo, ano);
    }

@Override
public void alugar(){
    System.out.println("Moto: "+modelo+"("+ano+") alugada");
    }

@Override
public void abastecer(){
    System.out.println("Abastecendo a moto "+modelo+"");
    }
}
