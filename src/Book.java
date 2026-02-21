public class Book {
    private static int contadorId= 1;

    private int id;
    private String titlo;
    private String author;
    private int year;
    private boolean available;

    public Book(String titlo, String author, int year){
        this.id = contadorId++;
        this.titlo = titlo;
        this.author = author;
        this.year = year;
        this.available = true;
    }
    public int getId(){
        return id;
    }

    public boolean isAvailable(){
        return available;
    }

    public void toLoan(){
        this.available = false;
    }

    public void toReturn(){
        this.available = true;
    }

    public String toString(){
        return id + " - " + titlo + " | " + author + " | " + year + " | " + (available ? "Disponível" : "Emprestar");
    }
}
