import java.util.Scanner;
public class AprendendoArrays2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite quantas linhas e colunas quer para sua matriz: ");
        int v = scan.nextInt();
        int[][] matriz = new int[v][v];
        for (int i = 0; i < v; i++){
            for (int j = 0; j < v; j++){
                System.out.print("Digite um valor para matriz [" +i+ "][" +j+"]: ");
                int valor = scan.nextInt();
                matriz[i][j] = valor;
            }
        }

        //Para printar precisa repetir os 2 for
        System.out.println("Esses são os valores de sua matriz: ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(matriz[i][j] + ".. ");
            }
        }
        scan.close();
    }
}
