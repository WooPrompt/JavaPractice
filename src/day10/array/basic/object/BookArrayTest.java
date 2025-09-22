package day10.array.basic.object;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5]; //Object array
        library[0] = new Book("First Book", "First Author");
        library[1] = new Book("Second Book", "2 Author");
        library[2] = new Book("3 Book", "3 Author");
        library[3] = new Book("4 Book", "4 Author");
        library[4] = new Book("5 Book", "5 Author");
        System.out.println(library[3].getAuthor());

        System.out.println("\nNormal for loop");
        for (int i = 0; i < library.length; i++) {
//            library[i] = new Book("BookName" + i, "BookAuthor" + i);
            library[i].showBookInfo();
        }

        System.out.println("\nAdvanced for loop");
        for(Book b : library){
            b.showBookInfo();
        }
    }

}
