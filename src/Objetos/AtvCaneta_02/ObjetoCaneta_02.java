package Objetos.AtvCaneta_02;

public class ObjetoCaneta_02 {
    // Atributos
    public String modelo;
    public String cor;
    protected int carga;
    private float ponta;
    private boolean tampada;

    // Metodos
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "/100");

    }
    protected void rabiscar(){
        if (this.tampada){ // this.tampada == true
            System.out.println("Não pode escrever com a caneta tampada!");
        }
        else{
            System.out.println("Escrevendo..");
        }
    }

    public void tampar(){
        this.tampada = true; //This é uma referencia ao proprio objeto que tampou (c1)
    }

    public void destampar(){
        this.tampada = false;
    }
}
