public class Book {
    String title;
    int releaseYear;
    int pages;
    Author author;

    public Book(String title,int releaseYear,
                     Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig(int pages){
        return pages > 250;
    }

    public boolean matches(String word){
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice(int pages, int rating) {
        if (pages * 3 * Math.sqrt(rating) < 250){
            return 250;
        }else {
            return (int) Math.floor(pages * 3 * Math.sqrt(rating));
        }
    }
}
