package Objetos.AtvNave_03;

class NaveDeGuerra extends Nave {
    public NaveDeGuerra(int vida, int distancia) {
        super(vida, distancia);
    }

    @Override
    public int receberDano(int dano) {
        return super.receberDano(dano / 2); // Resistência de guerra
    }

    @Override
    public void viajar(int viagem) {
        super.viajar(viagem + 10);
    }

    public int atirar() {
        return 30;
    }
}
