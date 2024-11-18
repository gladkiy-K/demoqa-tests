import org.junit.jupiter.api.*;

//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {
//    @Test //annotation
//    void successfulSearchTest() {
//        open("https://www.google.com/");
//        $("[name=q]").setValue("selenide").pressEnter();
//        $("[id=search]").shouldHave(text("https://selenide.org"));
//    }
    int result;

    @BeforeAll
    static void beforeAll() { // it ALWAYS must have static
        // it calls one time before everything
        System.out.println("###     beforeAll()\n");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("###     afterAll()\n");
        //same stuff works as a previous one but after
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("###     beforeEach()");
        result = getResult();
    }

    @AfterEach
    void afterEach(){
        System.out.println("###     afterEach()\n");
        result = 0;
    }

    @Test
    void firstTest () {
        System.out.println("### fTest");
        Assertions.assertTrue(result>2);
    }
    @Test
    void secondTest () {
        System.out.println("### sTest");
        Assertions.assertTrue(result>2);
    }

    private int getResult(){
        return 3;
    }
}
