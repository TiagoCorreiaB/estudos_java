package Objetos.AtvNave_02;

class NaveIni extends NaveM {
    public NaveIni(int vida, int distancia) {
        super(vida, distancia);
    }

    @Override
    public void viajar(int viagem) {
        super.viajar(viagem + 10);
    }

    @Override
    public void status(){
        System.out.println("O status da nave inimiga é: ");
        super.status();
    }

}
