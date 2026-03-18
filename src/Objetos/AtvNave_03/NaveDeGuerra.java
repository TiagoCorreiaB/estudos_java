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
        if (this.escudo > 0){
            this.escudo -= danoRecebido;
        }
        else{
            int novaVida = this.getVida() - danoRecebido;
            if (novaVida < 0){novaVida = 0;}
            this.setVida(novaVida);
        }
    }

    public boolean temHabilidade() {
        return canhaoDePlasma || rouboDeSucatas || interferenciaDeSensores;
    }

    public final int usarHabilidade(int escolha, int vidaInimigo){
        switch (escolha){
            case 1: return 20;
            case 2: return vidaInimigo / 3;
            case 3: //Mudar return para não retornar 0;
                break;
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
