package book;

public class BookList {

    //问题1：这些书放到书架上，那么怎么去组织书架，放若干本书？
    //解决方案：使用数组
    private Book[] books = new Book[10];
    private int usedSize;//有效的数据个数


    public BookList(){

        books[0] = new Book("三国演义","罗贯中",10,"小说");
        books[1] = new Book("西游记","吴承恩",59,"小说");
        books[2] = new Book("红楼梦","曹雪芹",16,"小说");

        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public void setBooks(int pos,Book books) {
        this.books[pos] = books;
    }

    public Book[] getBooks(){
        return books;
    }


}
