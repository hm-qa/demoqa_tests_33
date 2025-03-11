import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    int result;

    static @BeforeAll
    void beforeAll() {
        System.out.println("\n### BeforeAll\n");
    }


    @BeforeEach
    void beforeEach() {
        System.out.println("###    BeforeEach");
        result = getResult();
        //System.out.println(result);
    }

    @AfterEach
    void afterEach() {
        System.out.println("###    AfterEach\n");
        result = 0;
    }

    static @AfterAll
    void afterAll() {
        System.out.println("### AfterAll");
    }


    @Test
     void secondTest() {
        System.out.println("###       secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
     void firstTest() {
        System.out.println("###       firstTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
     void thirdTest() {
        System.out.println("###       thirdTest()");
        Assertions.assertTrue(result > 2);
    }


    private int getResult() {
        return 3;
    }

}
