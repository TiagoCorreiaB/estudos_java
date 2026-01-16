import java.util.Scanner; //Biblioteca do scanner
public class Exercitando {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int continuar = 1;
        while (continuar != 0){

            System.out.println("Digite 1 para tabela de multiplicação ou 2 para a divisão: ");
            int escolha = leitor.nextInt();
            double valor = 1.0;

            if (escolha == 1){
                System.out.println("Tabela de multiplicação: ");
                System.out.println(" ");
                for (int i = 1; i < 10; i++){
                    System.out.println("Tabuada do " + valor);
                    for (int j = 1; j < 10; j++)  {
                        System.out.printf("%.0f X %d = %.0f%n", valor, j, valor*j);
                    }
                    System.out.println(" ");
                    valor++;
                }
            }

            else if (escolha == 2){
                System.out.println("Tabela de divisão: ");
                System.out.println(" ");
                for (int i = 1; i < 10; i++){
                    System.out.println("Tabuada do " + valor);
                    for (int j = 1; j < 10; j++)  {
                        System.out.printf("%.0f / %d = %.2f%n", valor, j, valor/j);
                    }
                    System.out.println(" ");
                    valor++;
                }
            }

            else{
                System.out.println("Valor numérico não disponivel");
            }

            System.out.println("Deseja continuar fazendo operações? 1 = Sim | 0 = Não");
            continuar = leitor.nextInt();
        }

        leitor.close();
    }
}
