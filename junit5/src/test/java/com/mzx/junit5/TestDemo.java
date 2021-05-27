package com.mzx.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

/**
 * 测试示例
 *
 * @author 牧子兮
 * @since 2021/5/27 11:20
 */
public class TestDemo {
    // 标注测试方法
    @Test
    // 展示名称
    @DisplayName("Hello")
    void testHello() {
        System.out.println("Hello World!");
    }

    /**
     * 异常断言
     */
    @Test
    @DisplayName("AbnormalTest")
    void testAbnormal() {
        assertThrows(ArithmeticException.class, () -> System.out.println(1 % 0));
    }

    /**
     * 超时断言
     */
    @Test
    @DisplayName("TimeoutTest")
    void testTimeout() {
        // 测试方法执行超过指定时间时, 将会抛出异常
        assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(500));
    }
}
