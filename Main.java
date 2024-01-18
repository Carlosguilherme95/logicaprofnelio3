import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String firstName = scanner.nextLine();
        System.out.println("Digite sua idade:");
        float firstage = Integer.parseInt(scanner.nextLine());


        System.out.println("Digite seu nome:");
        String secondtName = scanner.nextLine();
        System.out.println("Digite sua idade:");
        float secondage = Integer.parseInt(scanner.nextLine());

        calcMedia(firstName, secondtName, firstage, secondage);

    }
    public static void calcMedia(String firstName, String secondtName, float firstage,float secondage){
        float mediaIdades = (firstage + secondage) / 2;
        System.out.println("A idade média de "+ firstName +" e "+ secondtName +" é "+ mediaIdades );
    }

}
/**
 * Problema "idades"
 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
 * nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
 * Exemplo:
 * Dados da primeira pessoa:
 * Nome: Maria Silva
 * Idade: 19
 * Dados da segunda pessoa:
 * Nome: Joao Melo
 * Idade 20
 * A idade média de Maria Silva e Joao Melo é de 19.5 anos
 */