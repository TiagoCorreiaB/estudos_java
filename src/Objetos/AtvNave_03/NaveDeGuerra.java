package Objetos.AtvNave_03;

class NaveDeGuerra extends NaveMae {

    private int escudo = 50;
    private int dano;

    public NaveDeGuerra(int vidaMaxima, int dano) {
        super(vidaMaxima);
        this.dano = dano;
    }

    private int getEscudo() {
        return escudo;
    }

    private void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    private int getDano() {
        return dano;
    }

    private void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public void receberDano(int danoRecebido) {
        if (this.escudo > 0){
            this.escudo -= danoRecebido;
        }
        else{
            int novaVida = this.getVida() - danoRecebido;
            if (novaVida < 0){novaVida = 0;}
            this.setVida(novaVida);
        }
    }

    public int darDano(){
        return this.getDano();
    }

    public void uparEquipamento(int blindagem, int armamento){
        this.setVida(this.vidaMaxima + blindagem);
        this.setDano(this.getDano() + armamento);
    }

    public void concertarNave(){
        if (this.getVida() > this.vidaMaxima){
             setVida(this.vidaMaxima);
        }
        if (this.getVida() > 0){
            setVida(getVida() + 10);
        }
    }

}
