public class Test {
    static void main() {
        Book[] books = new Book[3];
        String author = "";
        int year = 0;
        String title = "";
        Book book = new Book(title, author, year);
        PaperBook paperBook = new PaperBook("Кобзар","Тарас Щевченко",1840, 300);
        Ebook ebook = new Ebook("Кобзар","Тарас Щевченко",1840, "PDF");

        books[0]= book;
        books[1]= paperBook;
        books[2]= ebook;

        for (Book b: books){
            b.readBook();
        }

        Book book1 = BookFactory.createBook(
                "book", "Кобзар", "Тарас Шевченко", 1840
        );

        Book book2 = BookFactory.createBook(
                "ebook", "Java для чайников", "Барри Берд", 2024
        );

        Book book3 = BookFactory.createBook(
                "paper", "Гаррі Поттер", "Джоан Роулінг", 1997
        );

        System.out.println("ЗВИЧАЙНА КНИГА");
        book1.showInfo();
        book1.readBook();

        System.out.println();

        System.out.println("ЕЛЕКТРОННА КНИГА");
        book2.showInfo();
        book2.readBook();

        System.out.println();

        System.out.println("ПАПЕРОВА КНИГА");
        book3.showInfo();
        book3.readBook();
    }
}


