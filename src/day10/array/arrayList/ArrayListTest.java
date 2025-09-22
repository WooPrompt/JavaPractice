package day10.array.arrayList;

import day10.array.basic.object.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book("new Book","new Author");
        books.add(b1);
        books.add(new Book("ddd","ddd"));
//        books.get(0).showBookInfo();
//        books.get(1).showBookInfo();
//
//        Book book = books.get(0);
//        book.showBookInfo();
        System.out.println("\n Normal for loop");
        for(int i = 0; i<books.size(); i++){
            books.get(i).showBookInfo();
        }

        System.out.println("\n Advanced for loop"  );
        for(Book b : books){
            b.showBookInfo();
        }
    }
}
