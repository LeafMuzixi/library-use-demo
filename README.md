# library-use-demo

各种库的导入及使用示例

## junit5

`JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage`

1. **JUnit Platform**: Junit Platform是在JVM上启动测试框架的基础，不仅支持Junit自制的测试引擎，其他测试引擎也都可以接入。

2. **JUnit Jupiter**: JUnit Jupiter提供了JUnit5的新的编程模型，是JUnit5新特性的核心。内部 包含了一个测试引擎，用于在Junit Platform上运行。

3. **JUnit Vintage**: 由于JUint已经发展多年，为了照顾老的项目，JUnit Vintage提供了兼容JUnit4.x,Junit3.x的测试引擎。

### 主要注解说明:

1. **@Test** :表示方法是测试方法。但是与JUnit4的@Test不同，他的职责非常单一不能声明任何属性，拓展的测试将会由Jupiter提供额外测试

2. **@ParameterizedTest** :表示方法是参数化测试，下方会有详细介绍

3. **@RepeatedTest** :表示方法可重复执行，下方会有详细介绍

4. **@DisplayName** :为测试类或者测试方法设置展示名称

5. **@BeforeEach** :表示在每个单元测试之前执行

6. **@AfterEach** :表示在每个单元测试之后执行

7. **@BeforeAll** :表示在所有单元测试之前执行

8. **@AfterAll** :表示在所有单元测试之后执行

9. **@Tag** :表示单元测试类别，类似于JUnit4中的@Categories

10. **@Disabled** :表示测试类或测试方法不执行，类似于JUnit4中的@Ignore

11. **@Timeout** :表示测试方法运行如果超过了指定时间将会返回错误

12. **@ExtendWith** :为测试类或测试方法提供扩展类引用

包含 `junit5` 部分新特性的测试示例。
