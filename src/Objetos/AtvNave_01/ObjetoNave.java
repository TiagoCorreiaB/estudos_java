package Objetos.AtvNave_01;

public class ObjetoNave {
    private int vida;
    private int distancia;
    private int vidaMaxima;
    public ObjetoNave(int vida, int distancia){
        this.vida = vida;
        this.vidaMaxima = vida;
        this.distancia = distancia;
    }

    public void viajar(int viagem){
        this.distancia += viagem;
    }

    public int receberDano(int dano){
        this.vida -= dano;
        if (this.vida <= 0){
            this.vida = 0;
            return 1;
        }
        return 0;
    }

    public void reparar(int reparo){
        if (this.vida > 0) {
            this.vida += reparo;


            if (this.vida >= this.vidaMaxima) {
                this.vida = this.vidaMaxima;
            }
        }

    }

    public void status(){
        System.out.println("Distancia percorrida: " + this.distancia);
        System.out.println("Vida da Nave: " + this.vida);
    }

}
