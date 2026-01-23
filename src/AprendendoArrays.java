import java.util.Scanner;
public class AprendendoArrays {
    public static int Somar(int array[]){
        int soma = 0;
        for (int i = 0; i < array.length; i++){
            soma += array[i];
        }
        return soma;
    }
    public static void Organizar(int array[]){
        //Bubblesort
        int aux;
        int n = array.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < (n-1); j++){
                if (array[j] > array[j + 1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3]; //Lembre, 3 é a quantidade de elementos fixa, nao da pra mudar la pra frente
        
        for (int i = 0; i < 3; i++){ //Usando valor fixo do array
            System.out.print("Digite um numero para a posição " + (i + 1) + ": ");
            int valor = scan.nextInt();
            array[i] = valor;
        }
        for (int i = 0; i < array.length; i++){ //Usando tamanho do array com length
            System.out.println("Valor da " + (i + 1) + " posição: " + array[i]);
        }
        int resposta = Somar(array);
        System.out.println("O valor da soma dos seus elementos é: " + resposta);
        Organizar(array);
        for (int i = 0; i < array.length; i++){ //Usando tamanho do array com length
            System.out.println("Valor da " + (i + 1) + " posição: " + array[i]);
        }
        scan.close();
    }
}
