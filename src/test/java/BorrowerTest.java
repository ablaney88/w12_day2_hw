import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void setUp(){
        borrower = new Borrower("John");
        book = new Book("The fellowship of the ring", "Tolkien", "Fantasy");
    }

    @Test
    public void canAddToCollection(){
        borrower.add(book);
        assertEquals(1, borrower.bookCollectionSize());
    }
}
