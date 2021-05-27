package com.mzx.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.*;

/**
 * 动态测试示例
 * <p>
 * JUnit5允许动态的创建单元测试
 *
 * @author 牧子兮
 * @since 2021/5/27 17:37
 */
public class DynamicTestDemo {
    @TestFactory
    @DisplayName("DynamicTests")
    Iterable<DynamicTest> dynamicTests() {
        return List.of(dynamicTest("first", () -> assertTrue(true)),
                dynamicTest("second", () -> assertEquals(2 * 2, 4)));
    }
}
