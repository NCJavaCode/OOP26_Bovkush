public class Test {
    static void main() {
        Book[] books = new Book[3];
        Book book = new Book("Кобзар","Тарас Щевченко",1840);
        PaperBook paperBook = new PaperBook("Кобзар","Тарас Щевченко",1840);
        Ebook ebook = new Ebook("Кобзар","Тарас Щевченко",1840);

        books[0]= book;
        books[1]= paperBook;
        books[2]= ebook;

        for (Book b: books){
            b.readBook();
        }
    }
}
