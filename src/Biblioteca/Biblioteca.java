package Biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        Serviços serviços = new Serviços();
        boolean parar = false;

        System.out.println("Bem-vindo ao Sistema de Biblioteca!");

        do {
            int opcao = serviços.opcao(scanner);

            if (opcao == 6) {
                parar = true;
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Você escolheu a opção " + opcao);
            }
            
        } while (!parar);

        scanner.close();
    }
}