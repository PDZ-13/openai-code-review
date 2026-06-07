package plus.gaga.middleware.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Test(expected = NumberFormatException.class)
    public void testInvalidNumber1() {
        log.info("测试非法数字: aaaa1");
        Integer.parseInt("aaaa1");
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidNumber2() {
        log.info("测试非法数字: aaaa2");
        Integer.parseInt("aaaa2");
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidNumber3() {
        log.info("测试非法数字: aaaa3");
        Integer.parseInt("aaaa3");
    }
}
