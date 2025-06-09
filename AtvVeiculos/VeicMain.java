package AtvVeiculos;

public class VeicMain {
     public static void main(String[] args) {
    Carro aglmcarro = new Carro("Gol", 2004);
    Moto algmmoto = new Moto("XLR8", 2001);
    Bicicleta algmbike = new Bicicleta("Duas rodas?", 2003);

    System.out.println("Alugando veiculos:");
    aglmcarro.alugar();
    algmmoto.alugar();
    algmbike.alugar();
    System.out.println("-----------------");

    System.out.println("Abastencedo os veiculos:");
    aglmcarro.abastecer();
    algmmoto.abastecer();
    algmbike.carregar();
    System.out.println("-----------------------");

}
}