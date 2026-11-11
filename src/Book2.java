class Book2 {
    private String title;// Приховане поле, назву книги не можна змінити напряму

    public String getTitle() {   // Геттер метод для читання назви
        return title;
    }

    public void setTitle(String newTitle) { // Сеттер метод для встановлення назви
        title = newTitle;
    }
}
