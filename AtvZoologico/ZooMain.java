package AtvZoologico;

public class ZooMain {
    public static void main(String[] args) {
        Leao leoazinho = new Leao();
        Peixe peixinho = new Peixe();
        
        System.out.println("Descrição do Leão");
        leoazinho.emitirSom();
        leoazinho.Alimentar();
        
        System.out.println("\nDescrição do Peixe");
        peixinho.emitirSom();
        peixinho.Alimentar();
        peixinho.nadar();
        
    }
}