public class PaperBook extends Book{
    private int pages;

    public PaperBook(String title, String author, int year) {
        super(title, author, year);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public void readBook(Book book) {
        System.out.println("Читаємо паперову книгу");

    }
}







