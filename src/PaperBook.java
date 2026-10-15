public static class paperBook extends Book{
    private int pages;

    public paperBook(String title, String author, int year) {
        super(title, author, year);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
public void readBook() {
    System.out.println("Читаємо паперову книгу");
}
public static void main(String[] args) {

    Book book1 = new Book("Кобзар", "Тарас Шевченко", 1840);
    Book book2 = new paperBook("Кобзар", "Тарас Шевченко", 1840);

    book1.readBook();
    book2.readBook();
}






