package Objetos.AtvNave_02;

public class NaveM {
    protected int vida;
    protected int distancia;
    protected int vidaMaxima;


    protected NaveM(int vida, int distancia){
        this.vida = vida;
        this.vidaMaxima = vida;
        this.distancia = distancia;
    }

    public void viajar(int viagem){
        this.distancia += viagem;
    }

    public int getdistancia(){ return this.distancia; }

    public int receberDano(int dano){
        this.vida -= dano;
        if (this.vida <= 0){
            this.vida = 0;
            return 1; // Nave destruída
        }
        return 0; // Nave ainda operando
    }

    public void reparar(int reparo){
        this.vida += reparo;
        if (this.vida > vidaMaxima){
            this.vida = vidaMaxima;
        }
    }

    public void status(){
        System.out.println("Vida da Nave: " + this.vida);
    }

}

