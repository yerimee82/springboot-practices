package ex01;

import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {MyApplication.class})
@RequiredArgsConstructor
public class MyApplicationTest01 {
    private final Mycomponent myComponent;

    public void testMyComponentNotNull() {
        assertNotNull(myComponent);
    }
}
