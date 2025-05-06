package tests.be;

import org.testng.annotations.Test;
import services.BookStoreService;
import sharedData.SharedData;

public class ObtainAllBooksTest extends SharedData {

    @Test
    public void testMethod() {
        BookStoreService bookStoreService = new BookStoreService();
        bookStoreService.getAllBooks();
    }
}
