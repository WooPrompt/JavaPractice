package day10.array.basic.object;

public class Book {
    private String bookName;
    private String author ;

    public Book(String bookName,String author){
        this.bookName = bookName;
        this.author = author;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor(){
        return author;
    }

    public void showBookInfo(){
        System.out.println(this.getBookName()+" ,"+this.author);
    }
    public static void main(String[] args) {

    }
}
