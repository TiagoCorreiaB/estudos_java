package Objetos.AtvNave_03;

import java.util.Scanner;

public class AtividadeNave_03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        NaveMae naveMae = new NaveMae(100);
        NaveDeGuerra naveBatalha = new NaveDeGuerra(60, 25);
        NaveVarredura naveBusca = new NaveVarredura(40);

        int escolha;
        int viagem;

        System.out.print("Deseja iniciar a exploração? (1 = sim | 0 = não): ");
        escolha = scan.nextInt();

        while (escolha == 1) {

            System.out.print("Digite quantos km deseja viajar: ");
            viagem = scan.nextInt();

            for (int i = 0; i < viagem; i++) {
                naveMae.viajar();
                naveBatalha.viajar();
                naveBusca.viajar();
            }

            if (naveMae.getDistancia() > 0 && (naveMae.getDistancia() % 5 == 0 || naveMae.getDistancia() % 7 == 0 || naveMae.getDistancia() % 10 == 0)) {

                System.out.println("\n⚠ Você encontrou uma nave inimiga em " + naveMae.getDistancia() + " km!");

                // Instancia o inimigo aqui para ele vir com vida cheia a cada novo encontro
                NaveInimiga naveInimiga = new NaveInimiga(60, 18);
                boolean batalha = true;

                while (batalha) {

                    System.out.println("\nO que deseja fazer?");
                    System.out.println("[1] Atacar");
                    System.out.println("[2] Reparar nave");
                    System.out.println("[3] Buscar equipamentos");
                    System.out.println("[4] Status da sua nave");
                    System.out.println("[5] Status do inimigo");
                    System.out.println("[6] Fugir");

                    System.out.print("Resposta: ");
                    escolha = scan.nextInt();

                    switch (escolha) {

                        case 1:
                            int dano = naveBatalha.darDano();
                            naveInimiga.receberDano(dano);
                            System.out.println("Você causou " + dano + " de dano!");

                            if (naveInimiga.getVida() <= 0) {
                                System.out.println("A nave inimiga foi destruída!");
                                batalha = false;
                                break;
                            }

                            // Inimigo ataca de volta
                            int danoInimigo = naveInimiga.darDano();
                            naveBatalha.receberDano(danoInimigo);
                            System.out.println("O inimigo atacou e causou " + danoInimigo + " de dano!");

                            if (naveBatalha.getVida() <= 0) {
                                System.out.println("Sua nave foi destruída! GAME OVER.");
                                batalha = false;
                                escolha = 0; // Força o fim do jogo
                            }
                            break;

                        case 2:
                            naveBatalha.concertarNave();
                            System.out.println("Nave reparada! Vida atual: " + naveBatalha.getVida());
                            break;

                        case 3:
                            int loot = naveBusca.fazerBusca();
                            System.out.println("Busca realizada! Nível encontrado: " + loot);
                            naveBatalha.uparEquipamento(loot, loot);
                            System.out.println("Equipamentos e Blindagem melhorados!");
                            break;

                        case 4:
                            System.out.println("--- STATUS DA NAVE DE BATALHA ---");
                            System.out.println("Vida: " + naveBatalha.getVida() + "/" + naveBatalha.getVidaMaxima());
                            System.out.println("Escudo: " + naveBatalha.getEscudo());
                            System.out.println("Poder de Dano: " + naveBatalha.darDano());
                            break;

                        case 5:
                            System.out.println("--- STATUS DO INIMIGO ---");
                            System.out.println("Vida: " + naveInimiga.getVida());
                            break;

                        case 6:
                            System.out.println("Você fugiu!");
                            batalha = false;
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                }
            } else {
                System.out.println("Distância atual: " + naveMae.getDistancia() + " km. Nada encontrado no espaço...");
            }

            if (escolha != 0 && naveBatalha.getVida() > 0) {
                System.out.print("\nDeseja continuar explorando? (1 = sim | 0 = não): ");
                escolha = scan.nextInt();
            }
        }

        System.out.println("Fim de jogo.");
        scan.close();
    }
}