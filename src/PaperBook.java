public class PaperBook extends Book implements Nameable,Readable {
    private int pages;
    private String className;

    public PaperBook(String title, String author, int year, int i) {
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

    @Override
    public void readBook() {
        System.out.println("Відкриваємо паперову книгу");
        System.out.println("читання паперової книги");
    }

    @Override
    public void setClassName(String name) {
        this.className = name;
    }

    @Override
    public String getClassName() {
        return this.className;
    }
}







