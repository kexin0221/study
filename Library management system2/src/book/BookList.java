package book;

public class BookList {
    private Book[] books = new Book[10];
    private int UseSize = 0;

    public void booklist(){
        this.books[0] = new Book("三国演义", "罗贯中",10,"小说");
        this.books[1] = new Book("西游记", "吴承恩",20,"小说");
        this.books[2] = new Book("红楼梦", "曹雪芹",30,"小说");

        this.UseSize = 3;

    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public void setBooks(int pos,Book books) {
        this.books[pos] = books;
    }

    public int getUseSize() {
        return UseSize;
    }

    public void setUseSize(int useSize) {
        UseSize = useSize;
    }
}
