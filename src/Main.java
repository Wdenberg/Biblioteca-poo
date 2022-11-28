import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static  Boolean apresentacao(boolean d){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        if (d== false){
            System.out.println("Programa iniciado em " + formatador.format(date));
        }else {
            System.out.println("\nPrograma finalizado em " + formatador.format(date));
        }
        System.out.println("\n************ Fabricar de Software ************");
        System.out.println("************** Biblioteca *****************");
        System.out.println(" ******** Desenvolvido por: \nWdenberg " +
                "\nDevid" +
                "\nJoão" +
                "\nGladison" );
        return d;
    }


    public static String menu(){
        Scanner scan = new Scanner(System.in);
        String opcao;
        System.out.println("\n***********************************");
        System.out.println("***** DIGITE O NÚMERO DA OPÇAO DESEJADA *****");
        System.out.println("*********************************************");
        System.out.println("*       1 - Resgistrar Livro       *");
        System.out.println("*       2 - Listar Livros          *");
        System.out.println("*       3 - Atualizar Livros       *");
        System.out.println("*       4 - Locar Livros           *");
        System.out.println("*       5 - Deletar Livros         *");
        System.out.println("*       6 - Sair                   *");
        System.out.println("************************************************");
        System.out.println();

        opcao = scan.nextLine();
        return opcao;
    }

    public static void cod(){

        Livros livros = new Livros();

        Scanner scan = new Scanner(System.in);
        int fim = 0;
        String[] letras = {"a", "b", "c", "d", "e",
                            "f", "g", "h", "j", "l",
                            "m", "n","o", "p", "q",
                            "d", "r", "s", "t", "u",
                            "x", "z", "y", "k", "w",};

            do {
                switch (menu()){
                    case "1":
                        System.out.println("\n-------------- Registrar -------");
                        System.out.println("\n--------------------------------");
                        System.out.println("\nNome do Livro");
                        System.out.println("->");
                        livros.setNomelivro(scan.nextLine());
                        System.out.println("\nAutor");
                        System.out.println("->");
                        livros.setAutor(scan.nextLine());
                        System.out.println("\nCategoria do Livro");
                        System.out.println("->");
                        livros.setCategoria(scan.nextLine());
                        break;
                    case "2":
                        System.out.println("\n-------------- Listar Livros na Biblioteca  -------");
                        System.out.println("\n--------------------------------");
                        livros.imprimir();
                        livros.listalivros(livros);
                        break;

                    case "3":
                        System.out.println("\n-------------- Atualizar Livros da Biblioteca  -------");
                        System.out.println("\n--------------------------------");
                        System.out.println("\nNome do Livro");
                        System.out.println("->");
                        livros.setNomelivro(scan.nextLine());
                        System.out.println("\nAutor");
                        System.out.println("->");
                        livros.setAutor(scan.nextLine());
                        System.out.println("\nCategoria do Livro");
                        System.out.println("->");
                        livros.setCategoria(scan.nextLine());
                        livros.atualizar();
                        livros.imprimir();
                        break;

                }
            }while (fim <= 6);
            livros.imprimir();
    }
    public static void main(String[] args) {
            apresentacao(false);
            cod();
            apresentacao(true);


    }
}