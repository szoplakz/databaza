package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody s knihami ako knihy od urciteho roku, zanru, hodnotenia,s tagmi...
//bude sa pocitat bayesian average (priemerne hodnotenie celej databazy sa vzdy bude ziskavat zo vsetkych bookreviews)
import java.util.List;

public class DefaultBookManager implements BookManager {
    
    private InterfaceBookDao bookDao = MySQLDaoFactory.INSTANCE.getBookDao();
    
    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }
    
    @Override
    public void insertBook(Book book) {
        bookDao.insertBook(book);
    }

    @Override
    public void deleteBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
