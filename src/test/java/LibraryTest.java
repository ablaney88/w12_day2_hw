import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;


    @Before
    public void setUp(){
        library = new Library(2);
        book = new Book("The fellowship of the ring", "Tolkien", "Fantasy");
        book1 = new Book("The Two Towers", "Tolkien", "Fantasy");
        book2 = new Book("The return of the king", "Tolkien", "Fantasy");


    }

    @Test
    public void bookCountStartsAt0(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBooks(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }
}
