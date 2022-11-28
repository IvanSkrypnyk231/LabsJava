public record Book(int countOfPages, String author, float price, String name, int yearOfPublication, int rating) {
    public static int countOfObject = 0;
    public Book() {
        this(0, "No author", 0);
    }
    public Book(int countOfPages, String author, float price) {
        this(countOfPages, author, price, "No name", 0,0);
    }
    public Book {
        countOfObject++;
    }

    public static int getCountOfObject() {
        return countOfObject;
    }
    @Override
    public String toString() {

        return
                "Кількість сторінок: " + countOfPages +'\n'+
                "Автор: " + author + '\n' +
                "Ціна: " + price +'\n'+
                "Назва: " + name + '\n' +
                "Рік публікації: " + yearOfPublication+"\n" +
                "Рейтинг: " + rating;
    }
}
