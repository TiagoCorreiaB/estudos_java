package Objetos.AtvCaneta_02;

public class Caneta_02 {
    public static void main(String[] args){

        ObjetoCaneta_02 c1 = new ObjetoCaneta_02();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; Não pode mudar, esta privado.
        c1.carga = 80;
        // c1. tampada = false;
        c1.destampar(); // consigo mexer em atributos privados usando metodos publicos
        c1.rabiscar();
        c1.status();
    }
}
