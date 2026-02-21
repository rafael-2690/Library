import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library librery = new Library();

        while (true){
            System.out.println("\n1 - Cadastro livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Buscar por ID");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Titulo: ");
                    String title = scanner.nextLine();

                    System.out.print("Autor: ");
                    String author = scanner.nextLine();

                    System.out.print("Ano: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(title, author, year);
                    librery.addBook(book);
                    break;

                case 2:
                    librery.listBooks();
                    break;

                case 3:
                    System.out.println("Digite o ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    Book foundBook = librery.searchBookId(id);
                    if (foundBook != null) {
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
