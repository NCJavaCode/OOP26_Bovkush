public class LibraryManager {

    // 1. Створив приватну статичну змінну LibraryManager
    private static LibraryManager manager;
    private String managerName;

    // 2. Зробив конструктор
    private LibraryManager(String name) {
        this.managerName = name;
    }

    // 3. Створив статичний метод, який буде повертати тип нашого класу
    public static LibraryManager getManager(String name) {
        if (manager == null) { // Перевірка чи існує такий об'єкт
            manager = new LibraryManager(name); // Якщо об'єкта не існує то створюємо
        }
        return manager;
    }
    public String getManagerName() {
        return managerName;
    }
}