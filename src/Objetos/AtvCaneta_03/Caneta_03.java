package Objetos.AtvCaneta_03;

public class Caneta_03 {
    public static void main(String[] args){
        ObjetoCaneta_03 c1 = new ObjetoCaneta_03("Bic", "Preta", 0.5f);
        //c1.setModelo("Bic"); forma de setttar
        // c1.ponta = 0.5f Eu não poderia fazer isso porque é private o atributo
        // System.out.println("Tenho uma caneta com ponta: " + c1.getPonta());  Mostra o status separadamente com o get
        c1.status();
        ObjetoCaneta_03 c2 = new ObjetoCaneta_03("warc", "Azul", 0.8f);
        c2.status();
    }
}
