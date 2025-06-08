package AtvBicicleta;

public class BikeMain {
    public static void main(String[] args) {
        bicicleta bike = new bicicleta(15);
    System.out.println("Status inicial:");
        bike.imprimir();
        
    System.out.println("-----------------");
    System.out.println("Status de acelerar:");
        bike.acelerar(14);
        bike.imprimir();
    
    System.out.println("-----------------");
    System.out.println("Status de frear:");
        bike.frear(5);
        bike.ajustarmarcha();
        bike.imprimir();
    }
}