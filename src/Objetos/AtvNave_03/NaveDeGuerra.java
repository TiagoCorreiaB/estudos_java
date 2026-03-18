package Objetos.AtvNave_03;

public class NaveDeGuerra extends NaveMae {

    private int escudo = 50;
    private int dano;
    private boolean canhaoDePlasma = false;
    private boolean rouboDeSucatas = false;
    private boolean interferenciaDeSensores = false;


    public NaveDeGuerra(int vidaMaxima, int dano) {
        super(vidaMaxima);
        this.dano = dano;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public void receberDano(int danoRecebido) {
        if (this.escudo > 0) {
            this.escudo -= danoRecebido;
            if (this.escudo < 0) { // Se o escudo ficar negativo (quebrou)
                int danoRestante = Math.abs(this.escudo); // Pega o que sobrou do dano
                this.escudo = 0; // Zera o escudo
                int novaVida = this.getVida() - danoRestante; // Tira o resto da vida
                this.setVida(Math.max(novaVida, 0)); // Garante que a vida não fique negativa
            }
        } else {
            // Se já não tem escudo, tira tudo da vida
            int novaVida = this.getVida() - danoRecebido;
            this.setVida(Math.max(novaVida, 0));
        }
    }

    public boolean temHabilidade() {
        return canhaoDePlasma || rouboDeSucatas || interferenciaDeSensores;
    }

    public final int usarHabilidade(int escolha, int vidaInimigo){
        switch (escolha){
            case 1: return 20;
            case 2: return vidaInimigo / 3;
            case 3: return 1;
        }

        return 0;
    }

    public final void desbloquearHabilidade(int rodada){
        if (rodada >= 10){
            this.canhaoDePlasma = true;
        }
        if (rodada >= 20) {
            this.rouboDeSucatas = true;
        }
        if (rodada >= 30) {
            this.interferenciaDeSensores = true;
        }

    }

    public void mostrarHabilidade(){
        if (canhaoDePlasma){
            System.out.println("|     1- Canhão de plasma      |");
        }
        if (rouboDeSucatas){
            System.out.println("|     2- Roubo de Sucatas      |");
        }
        if (interferenciaDeSensores){
            System.out.println("| 3- Interferencia de Sensores |");
        }
    }

    public boolean isHabilidade(int escolha){
        if (escolha == 1 && canhaoDePlasma){
            return true;
        }
        if (escolha == 2 && rouboDeSucatas){
            return true;
        }
        if (escolha == 3 && interferenciaDeSensores){
            return true;
        }
        return false;
    }

    public final void recarrecarEscudo(){
        this.escudo = 50;
    }

    public int darDano(){
        return this.getDano();
    }

    public void uparEquipamento(int blindagem, int armamento){
        this.setVidaMaxima(this.getVidaMaxima() + blindagem);
        this.setVida(this.vidaMaxima + blindagem);
        this.setDano(this.getDano() + armamento);
    }

    public void concertarNave(int vida){
        if (this.getVida() > 0 && this.getVida() < this.vidaMaxima) {
            setVida(getVida() + vida);
            if (this.getVida() > this.vidaMaxima) {
                setVida(this.vidaMaxima);
            }
        }
    }

}
