package com.mzx.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 参数化测试示例
 *
 * @author 牧子兮
 * @since 2021/5/27 17:42
 */
public class ParameterizedTestDemo {
    // 表示参数化测试方法
    @ParameterizedTest
    @DisplayName("ParameterizedTest")
    // 指定入参来源, 支持八大基础类型及 Class 类型
    @ValueSource(strings = {"one", "two", "three"})
    // 提供一个 null 的入参
//    @NullSource
    void testParameterized(String numStr) {
        System.out.println(numStr);
        assertTrue(StringUtils.isNotBlank(numStr));
    }

    /**
     * 枚举也可以作为参数进行测试
     *
     * @param dayOfWeek {@link DayOfWeek}
     */
    @ParameterizedTest
    @DisplayName("EnumParameterizedTest")
    // 提供一个枚举入参
    @EnumSource(DayOfWeek.class)
    void testEnumParameterized(DayOfWeek dayOfWeek) {
        System.out.println(dayOfWeek);
        assertNotNull(dayOfWeek);
    }

    /**
     * 工厂方法作为参数进行测试
     * <p>
     * 详细信息查看 {@link MethodSource} 注释
     * <p>
     * 可以使用工厂方法(外部的工厂方法必须为静态,
     * 内部非静态工厂方法则必须使用 @TestInstance(org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS) 注释测试类)
     *
     * @param num {@link int}
     */
    @ParameterizedTest
    @DisplayName("MethodParameterizedTest")
    // 提供一个工厂方法作为入参
    @MethodSource("com.mzx.junit5.TestInstance#randomNum")
    void testMethodParameterized(int num) {
        System.out.println(num);
    }

    /**
     * CSV(逗号分隔值文件格式) 作为参数进行测试
     */
    @ParameterizedTest
    @DisplayName("CsvParameterizedTest")
    // 提供 Csv 格式的数据作为入参
    @CsvSource({"foo, 1", "bar, 2", "'baz, qux', 3", "sss,"})
    // 使用类路径中的CSV文件作为参数进行测试, 每一行都会调用一次参数化测试
//    @CsvFileSource(resources = "/test.csv")
    void testCsvParameterized(String first, String second) {
        System.out.println(first + " " + second);
        assertNotNull(first);
    }
}
