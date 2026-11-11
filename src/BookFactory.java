public class BookFactory {

    public static Book createBook(String type, String title, String author, int year) {

        if (type.equalsIgnoreCase("ebook")) {
            return new Ebook(title, author, year, "PDF");
        }

        if (type.equalsIgnoreCase("paper")) {
            return new PaperBook(title, author, year, 300);
        }

        if (type.equalsIgnoreCase("book")) {
            return new Book(title, author, year);
        }
        return null;
    }
}
