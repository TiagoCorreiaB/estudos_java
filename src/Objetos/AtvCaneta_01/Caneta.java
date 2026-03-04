package Objetos.AtvCaneta_01;

import java.util.Scanner;

public class Caneta {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ObjetoCaneta c1 = new ObjetoCaneta();

        System.out.print("Digite o modelo da caneta 1: ");
        c1.modelo = scan.nextLine();
        System.out.print("Digite a carga da caneta: ");
        c1.carga = scan.nextInt();
        if (c1.carga > 100 || c1.carga < 0){
            System.out.print("Digite um número entre 0 e 100: ");
            c1.carga = scan.nextInt();
        }
        c1.tampar();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.status();
        c1.rabiscar();

        scan.nextLine();
        ObjetoCaneta c2 = new ObjetoCaneta();
        System.out.print("Digite o modelo da caneta 2: ");
        c2.modelo = scan.nextLine();
        System.out.print("Digite a carga da caneta: ");
        c2.carga = scan.nextInt();
        if (c2.carga > 100 || c2.carga < 0){
            System.out.print("Digite um número entre 0 e 100: ");
            c2.carga = scan.nextInt();
        }
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.status();
        c2.destampar();
        c2.rabiscar();

        scan.close();
    }
}
