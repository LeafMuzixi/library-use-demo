package com.mzx.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * 内嵌单元测试示例
 *
 * @author 牧子兮
 * @since 2021/5/27 17:33
 */
public class NestedTestDemo {
    @Test
    @DisplayName("Nested")
    void isInstantiatedWithNew() {
        System.out.println("最一层--内嵌单元测试");
    }

    // 该注解可以静态内部成员类的形式对测试用例类进行逻辑分组
    @Nested
    @DisplayName("Nested2")
    class Nested2 {

        @BeforeEach
        void Nested2_init() {
            System.out.println("Nested2_init");
        }

        @Test
        void Nested2_test() {
            System.out.println("第二层-内嵌单元测试");
        }


        @Nested
        @DisplayName("Nested3")
        class Nested3 {

            @BeforeEach
            void Nested3_init() {
                System.out.println("Nested3_init");
            }

            @Test
            void Nested3_test() {
                System.out.println("第三层-内嵌单元测试");
            }
        }
    }
}
