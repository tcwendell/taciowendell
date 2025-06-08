package AtvBicicleta;

public class bicicleta{
    public int velocidade;
    public int marcha;
    public int velocidadeMax;

public bicicleta(int velocidadeMax){
    this.velocidadeMax=velocidadeMax;
}
public void acelerar(int aumentar){
    this.velocidade=Math.min(this.velocidade+ aumentar, this.velocidadeMax);
    ajustarmarcha();
}
public void frear(int diminuir){
    this.velocidade=Math.max(0, this.velocidade- diminuir);
    ajustarmarcha();
    }
public void ajustarmarcha(){
    if(this.velocidade==0){
        this.marcha=0;
    }
    else if(this.velocidade<5){
        this.marcha=1;
    }
    else if(this.velocidade<7){
        this.marcha=2;
    }
    else{
        this.marcha=3;
    }
}
public void imprimir(){
    System.out.println("Velocidade:"+this.velocidade+"\nMarcha:"+this.marcha+"\nVelocidade Max:"+this.velocidadeMax);
}
}