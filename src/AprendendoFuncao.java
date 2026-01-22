import java.util.Scanner;
public class AprendendoFuncao {
    public static String ParOuImpar(int valor){
        if (valor % 2 == 0){
            return "O número " + valor + " é Par";
        }
        else{
            return "O número " + valor + " é Impar";
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor para verificar se é par ou impar: ");
        int numero = scan.nextInt();
        String resposta = ParOuImpar(numero);
        System.out.println(resposta);
        scan.close();
    }
}
