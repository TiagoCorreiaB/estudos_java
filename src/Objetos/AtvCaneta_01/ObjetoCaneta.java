package Objetos.AtvCaneta_01;

public class ObjetoCaneta {
    String modelo;
    String cor;
    int carga;
    float ponta;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "/100");

    }
    void rabiscar(){
        if (this.tampada){ // this.tampada == true
            System.out.println("Não pode escrever com a caneta tampada!");
        }
        else{
            System.out.println("Escrevendo..");
        }
    }

    void tampar(){
        this.tampada = true; //This é uma referencia ao proprio objeto que tampou (c1)
    }

    void destampar(){
        this.tampada = false;
    }
}
