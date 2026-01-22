import java.util.Scanner;
public class AprendendoFuncao2 {
    public static void MostrarValores(String nome,int idade){
        System.out.println("Olá " + nome + "!");
        System.out.println("Você tem " + idade + " anos");
        System.out.print("Seja bem vindo ao sistema");
    }
    public static void Cadastro(Scanner scan){
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        if (idade < 18){
            System.out.print("Menor de 18 anos, acesso negado");
            scan.close();
            return;
        }
        MostrarValores(nome, idade);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("--Bem vindo ao sistema de cadastro--");
        Cadastro(scan);
        scan.close();
    }
}
