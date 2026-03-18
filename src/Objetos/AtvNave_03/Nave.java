package Objetos.AtvNave_03;

public abstract class Nave implements CaracteristicasNave {
    //Atributos
    protected int vida;
    protected int vidaMaxima;
    protected int distancia;
    protected boolean fulga;

    //Construtor
    public Nave(int vidaMaxima) {
        this.fulga = false;
        this.distancia = 0;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
    }


    //Metodos especiais (getters e setters)
    public boolean isFulga() {
        return fulga;
    }

    public void setFulga(boolean fulga) {
        this.fulga = fulga;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia += distancia;
    }

    //Metodos Comuns
    public abstract void viajar(int viagem);

    public abstract boolean fugir();

    public abstract void receberDano(int dano);

}

