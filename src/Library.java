import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void listBooks(){
        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
    }

    public Book searchBookId(int id) {
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getId() == id){
                return books.get(i);
            }
        }
        return null;
    }
}
