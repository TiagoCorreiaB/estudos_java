package Objetos.AtvNave_03;

public class NaveMae extends Nave {

    public NaveMae(int vidaMaxima) {
        super(vidaMaxima);
    }

    @Override
    public final void viajar() {
        this.setDistancia(this.distancia);
    }

    @Override
    public final boolean fugir(){
        return isFulga();
    }

    @Override
    public void receberDano(int dano) {
        int novaVida = this.getVida() - dano;
        if (novaVida < 0){novaVida = 0;}
        this.setVida(novaVida);
    }
}
