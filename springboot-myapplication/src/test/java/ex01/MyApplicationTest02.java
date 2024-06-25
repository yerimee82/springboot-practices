package ex01;

import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@RequiredArgsConstructor
public class MyApplicationTest02 {
    private final Mycomponent myComponent;

    @Test
    public void testMyComponentNotNull() {
        assertNotNull(myComponent);
    }
}
