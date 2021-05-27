package com.mzx.junit5;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * 测试实例
 *
 * @author 牧子兮
 * @since 2021/5/27 15:29
 */
public class TestInstance {
    static IntStream randomNum() {
        return IntStream.of(ThreadLocalRandom.current().nextInt(), ThreadLocalRandom.current().nextInt());
    }
}
