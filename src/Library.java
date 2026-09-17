public abstract class Library {

    private String title;
    private int year;

    public Library(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 && year <= 2026) {
            this.year = year;
        }
    }
}