package Objetos.AtvNave_02;

class NaveIni extends NaveM {
    public NaveIni(int vida, int distancia) {
        super(vida, distancia);
    }

    @Override
    public int receberDano(int dano) {
        return super.receberDano(dano / 2);
    }

    @Override
    public void viajar(int viagem) {
        super.viajar(viagem + 10);
    }


}
