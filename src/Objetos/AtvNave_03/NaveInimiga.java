package Objetos.AtvNave_03;


public class NaveInimiga extends NaveDeGuerra {
    public NaveInimiga(int vidaMaxima) {
        super(vidaMaxima);
    }

    @Override
    public void receberDano(int dano) {
        int novaVida = this.getVida() - dano;
        if (novaVida < 0){novaVida = 0;}
        this.setVida(novaVida);
    }

}
