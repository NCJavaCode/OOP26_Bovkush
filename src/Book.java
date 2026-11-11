public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = this.title;
        this.author = this.author;
        this.year = this.year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 && year <= 2026) {
            this.year = year;
        }
    }
    public void readBook() {
        System.out.println("Читаємо звичайну книгу");
    }

    public void setTitle(String кобзар) {
    }

    public void showInfo() {
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Рік: " + year);
    }
}
