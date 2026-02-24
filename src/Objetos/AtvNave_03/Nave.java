package Objetos.AtvNave_03;

public abstract class Nave {
    protected int vida;
    protected int distancia;
    protected int vidaMaxima;

    // Adicionei este construtor na classe base para facilitar
    public Nave(int vida, int distancia) {
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
        this.vida += reparo;
        if (this.vida >= vidaMaxima){
            this.vida = vidaMaxima;
        }
    }

    public void status(){
        System.out.println("Distancia percorrida: " + this.distancia);
        System.out.println("Vida da Nave: " + this.vida);
    }
}

