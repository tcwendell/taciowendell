package AtvBicicleta;

public class BikeMain {
    public static void main(String[] args) {
        bicicleta bike = new bicicleta(100);
    System.out.println("Status inicial:");
        bike.imprimir();
        
    System.out.println("-----------------");
    System.out.println("Status de acelerar:");
        bike.acelerar(27);
        bike.imprimir();
    
    System.out.println("-----------------");
    System.out.println("Status de frear:");
        bike.frear(4);
        bike.ajustarmarcha();
        bike.imprimir();
    }
}