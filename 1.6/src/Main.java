public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой", 10);
        Book book = new Book("Война и Мир", 1860, author, 2500 );
        System.out.printf("Эта книга большая? %s%n ",book.isBig(book.pages));
        System.out.println(book.matches("Мир")?"Книга или автор содержат слово ": "Книга или автор не содержат слово");
        System.out.println(book.estimatePrice(book.pages,author.rating) + " рублей стоит эта книга");
        System.out.println();
        Author author2 = new Author("Жуль", "Верн", 2);
        Book book2 = new Book("1000 лье под водой", 1800, author2, 50 );
        System.out.printf("Эта книга большая? %s%n ",book2.isBig(book2.pages));
        System.out.println(book2.matches("Жард")?"Книга или автор содержат слово ": "Книга или автор не содержат слово");
        System.out.println(book2.estimatePrice(book2.pages,author2.rating) + " рублей стоит эта книга");
    }
}