package Objetos.AtvNave_03;

public abstract class Nave implements CaracteristicasNave {
    //Atributos
    private int vida;
    private int vidaMaxima;
    private int distancia;

    //Metodos especiais (getters e setters)
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
        this.distancia = distancia;
    }

    //Metodos Comuns
    public abstract void viajar();

    public abstract void fugir();

    public abstract void receberDano();
}

