package srcs;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookArrayList;

    public Library() {
    }

    public Library(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }

    void    addBook(Book b)
    {
        bookArrayList.add(b);
    }

    void    removeBookByIsbn(String isbn)
    {
        if (isbn != null && !isbn.isEmpty())
        {
            bookArrayList.removeIf(book -> book.getIsbn().equals(isbn));
        }
/*
        for (int i = 0; i < bookArrayList.size(); i++) {
            if (bookArrayList.get(i).getIsbn().equals(isbn)) {
                bookArrayList.remove(i);
                break; // solo eliminamos la primera coincidencia
            }
        }
*/
    }
    void    printAllBooks()
    {
        for (Book b : bookArrayList)
        {
            System.out.println(b.getTitle() + " by " + b.getAuthor()
                    + " (ISBN: " + b.getIsbn() + " ).");
        }
    }
}
