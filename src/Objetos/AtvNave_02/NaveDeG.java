package Objetos.AtvNave_02;

// Removi o 'public' daqui para funcionar no mesmo arquivo NaveMae.java
class NaveDeG extends NaveM {
    public NaveDeG(int vida, int distancia) {
        super(vida, distancia);
    }

    @Override
    public void viajar(int viagem) {
        super.viajar(viagem + 10);
    }

    public int atirar() {
        return 30;
    }

    public void usarEscudo(){
        int dano;
        dano = (25 * 60) / 100;
        receberDano(dano);
    }

    @Override
    public void status(){
        System.out.println("O status da nave de guerra é: ");
        super.status();
    }
}
