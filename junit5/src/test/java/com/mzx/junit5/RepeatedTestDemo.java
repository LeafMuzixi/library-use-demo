package com.mzx.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 重复测试示例
 *
 * @author 牧子兮
 * @since 2021/5/27 17:41
 */
public class RepeatedTestDemo {
    /**
     * 重复测试
     */
    @RepeatedTest(10)
    @DisplayName("RepeatedTest")
    void testRepeated() {
        assertEquals(1, 1);
    }
}
