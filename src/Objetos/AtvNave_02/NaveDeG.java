package Objetos.AtvNave_02;

// Removi o 'public' daqui para funcionar no mesmo arquivo NaveMae.java
class NaveDeG extends NaveM {
    public NaveDeG(int vida, int distancia) {
        super(vida, distancia);
    }

    @Override
    public int receberDano(int dano) {
        return super.receberDano(dano / 2);
    }
    // A lógica do super.receberDano já trata a vida,
    // mas você precisa passar o dano reduzido para ele.

    @Override
    public void viajar(int viagem) {
        super.viajar(viagem + 10);
    }

    public int atirar() {
        return 30;
    }
}
