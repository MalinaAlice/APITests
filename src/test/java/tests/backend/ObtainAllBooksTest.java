package tests.backend;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import backend.services.BookStoreService;
import sharedData.Hooks;

@Feature("FE-123")
@Story("ST-322")
public class ObtainAllBooksTest extends Hooks {

    @Test(description = "TC-DEF: This is Gabi's test")
    public void testMethod() {
        BookStoreService bookStoreService = new BookStoreService();
        bookStoreService.getAllBooks();
    }
}
