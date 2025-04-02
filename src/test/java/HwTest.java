import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



public class HwTest {
    @BeforeAll
    static void beforeAll() {
    Configuration.browserSize = "1920x1080";
    Configuration.baseUrl = "https://github.com/selenide/selenide";
    Configuration.pageLoadStrategy = "eager";
}

@Test
