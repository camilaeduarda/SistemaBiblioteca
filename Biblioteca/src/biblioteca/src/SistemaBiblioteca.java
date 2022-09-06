package biblioteca.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.event.PrintEvent;

public class SistemaBiblioteca {

    private static String[] opcoes = {
        " ______________________________________ ",
        "|_________ Sistema Biblioteca _________|",
        "|_________ Escolha uma opção: _________|",
        "|______________________________________|",
        "|1- Cadastrar Livro                    |",
        "|2- Cadastrar Funcionario              |",
        "|3- Cadastrar Estudante                |",
        "|4- Cadastrar Autor                    |",
        "|5- Realizar Empréstimo                |",
        "|6- Receber Empréstimo                 |",
        "|0- Sair                               |",
        "|______________________________________|",
        };


        private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        private static List<Autor> autores = new ArrayList<Autor>();
        private static List<Livro> livros = new ArrayList<Livro>();
        
        private static Scanner buffer = new Scanner(System.in);
    public static void main (String[] args){

        int op = 1;
        while(op != 0) {
            printMenu();
            System.out.println("\n\n");
            op = buffer.nextInt();
            escolha(op);
        }
    }

    public static void printMenu() {
        System.out.println("\033[H\033]2J");
        System.out.flush();
        for (String op : opcoes) {
            System.out.println(op);
        }
    }

    //---------------------------------------------------------------//
    private static void escolha (int op) {
        switch (op) {
            //cadastrar o livro//
            case 1:
                Livro novoLivro = Livro.cadastrarLivro();
                System.out.println("\nLivro cadastrado!\n Resumo...\n");
                System.out.println(novoLivro.toString());
                livros.add(novoLivro);
                break;
            default:
            System.out.println("Saindo da func escolha");
            
            //cadastrar funcionario
            //case 2:

        }
    }
}
