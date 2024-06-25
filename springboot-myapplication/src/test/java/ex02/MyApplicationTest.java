package ex02;

import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@RequiredArgsConstructor
public class MyApplicationTest {
    private MyComponent myComponent;

    @Test
    public void testMyComponentNotNull() {
        assertNotNull(myComponent);
    }
}
