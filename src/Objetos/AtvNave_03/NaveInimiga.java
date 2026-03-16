package Objetos.AtvNave_03;


public class NaveInimiga extends NaveDeGuerra {
    public NaveInimiga(int vidaMaxima, int dano) {
        super(vidaMaxima, dano);
    }

    @Override
    public void receberDano(int dano) {
        int novaVida = this.getVida() - dano;
        if (novaVida < 0){novaVida = 0;}
        this.setVida(novaVida);
    }

}
