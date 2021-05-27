public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Подсознание может всё", "Jоn Kexo", new String[140], 1997);
        Book book2 = new Book("Java. Библиотека профессионала", "К. С. Хорстманн", new String[976], 2019);

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode() == book2.hashCode());
    }
}