package org.openea.generator.utils;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * GenUtils测试用例
 *
 */
@SpringBootTest
public class GenUtilsTest {
    @Test
    public void testTableToJava() {
        String javaName = GenUtils.tableToJava("t_event_message", "t_");
        Assertions.assertThat(javaName).isEqualTo("EventMessage");
    }
}
