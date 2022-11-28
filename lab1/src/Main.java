public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book(561, "Ден Браун", 300);
        Book book2 = new Book(432, "Толкін", 250, "Володар персня", 2001,10);

        System.out.println("book:\n" + book + "\n");
        System.out.println("book1:\n" + book1 + "\n");
        System.out.println("book2:\n" + book2 + "\n");

        System.out.println("Кількість обєктів: " + Book.getCountOfObject());
    }
}
