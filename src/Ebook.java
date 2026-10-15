public class Ebook extends Book {
  private String format;

    public Ebook(String title, String author, int year) {
        super(title, author, year);
    }

    public String getFormat(){
      return this.format;}

  // Перший перевантажений метод
  public void showInfo(String format) {
    System.out.println("Формат книги: " + format);}
  // Другий перевантажений метод
  public void showInfo() {
    System.out.println("Це електронна книга");}


  @Override
  public void readBook() {
    System.out.println("читання єлектроної кнги");
  }
}

