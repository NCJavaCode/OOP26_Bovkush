public class Ebook extends Book implements Nameable, Readable {
  private String format;
  private String className;

  public Ebook(String title, String author, int year, String pdf) {
    super(title, author, year);
  }

  public String getFormat() {
    return this.format;
  }

  // Перший перевантажений метод
  public void showInfo(String format) {
    System.out.println("Формат книги: " + format);
  }

  // Другий перевантажений метод
  public void showInfo() {
    System.out.println("Це електронна книга");
  }


  @Override
  public void readBook() {
    System.out.println("Включаємо електронну книгу");
    System.out.println("читання єлектроної книги");
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

