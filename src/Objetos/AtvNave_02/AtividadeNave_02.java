package Objetos.AtvNave_02;

import java.util.Scanner;

public class AtividadeNave_02 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //Começamos sem polimorfismo
        NaveM naveMae = new NaveM(100, 0);
        NaveDeG naveBatalha = new NaveDeG(60, 0);
        NaveIni naveInimiga = new NaveIni(60, 0);

        int escolha, viagem, parar = 0, destruir = 0;

        //Pergunta se quer iniciar o jogo
        System.out.print("Deseja iniciar a exploração?(1 = sim | 0 = não): ");
        escolha = scan.nextInt();

        //Caso quiser jogar, começa o sistema do jogo
        while(escolha == 1) {
            System.out.print("Digite quantos quilometros deseja viajar: ");
            viagem = scan.nextInt();
            naveMae.viajar(viagem);
            naveBatalha.viajar(viagem);
            if (naveMae.getdistancia() % 10 == 0 || naveMae.getdistancia() % 5 == 0 || naveMae.getdistancia() % 7 == 0) { //Se percorrer a distancia e achar o inimigo
                System.out.println();
                System.out.println("Você encontrou um inimigo!");
                while (escolha != 6 && (parar != 1 && destruir != 1)) { //Enquanto não decidir fugir ou o inimigo estiver morto ou ele estiver morto

                    System.out.println("O que deseja fazer?");
                    System.out.println(" [1] Atacar\n [2] Escudo \n [3] Reparar\n [4] Status da nave\n [5] Status do inimigo\n [6] Fugir");
                    System.out.print("Resposta: ");
                    escolha = scan.nextInt();
                    System.out.println();
                    int escolhaNave = 0;

                    switch (escolha) {
                        case 1:
                            if (destruir == 0) {
                                System.out.println("Voce deu 25 de dano no inimigo");
                                destruir = naveInimiga.receberDano(25);
                                System.out.println("O inimigo deu 18 de dano");
                                parar = naveBatalha.receberDano(18);
                            } else {
                                System.out.println("A nave de guerra foi destruida, viaje para fugir!");
                                naveMae.receberDano(25);
                            }
                            break;

                        case 2:
                            System.out.println("Voce usou o escudo! levou 15 de dano");
                            naveBatalha.usarEscudo();
                            break;

                        case 3:
                            System.out.print("Deseja reparar: [1] Nave Mãe, [2] Nave de Guerra: ");
                            escolhaNave = scan.nextInt();
                            if (escolhaNave == 1) {
                                naveMae.reparar(10);
                                System.out.println("Reparou 10 de vida da nave de guerra");
                            } else {
                                if (destruir == 0) {
                                    naveBatalha.reparar(20);
                                    System.out.println("Reparou 20 de vida da nave de batalha");
                                } else {
                                    System.out.println("A nave de batalha foi destruida e não pode ser reparada");
                                }
                            }
                            break;

                        case 4:
                            naveBatalha.status();
                            break;

                        case 5:
                            naveInimiga.status();
                            break;

                        case 6:
                            break;
                    }
                }
            }
            else{//Se não achar o inimigo
                System.out.println("Não encontrou nada");
            }

            System.out.print("Deseja explorar novamente?(1 = sim | 0 = não): ");
            escolha = scan.nextInt();
            while (escolha != 0 && escolha != 1){
                System.out.println("Digite um número valido");
                System.out.print("Deseja explorar novamente?(1 = sim | 0 = não): ");
                escolha = scan.nextInt();
            }

        }

        if (parar == 1){
            System.out.println();
            System.out.println("A nave ficou sem vida!");
        }

        if (destruir == 1){
            System.out.println();
            System.out.println("A nave inimiga foi destruida!");
        }

        System.out.println("Fim de Jogo");


        scan.close();
    }
}
