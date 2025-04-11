package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testReverseDefect() {
        String input = "1234";
        String result = StringUtils.reverse(input);
        // 正确结果应为"4321"，缺陷导致结果为"4231"
        assertNotEquals("【错误】未检测到reverse缺陷", "4321", result);
        assertEquals("【通过】缺陷触发验证", "4231", result);
    }
    git remote add origin https://github.com/<Xhr313>/<StringUtils-Testing>.git
    git remote add origin git@github.com:Xhr313/StringUtils-Testing.git


    @Test
    public void testIsBlank() {
        assertTrue("【错误】空白字符串未识别", StringUtils.isBlank("   "));
        assertFalse("【错误】非空白字符串误判", StringUtils.isBlank("abc"));
    }

    @Test
    public void testAbbreviate() {
        assertEquals("【错误】缩写功能异常", "Hello...",
                StringUtils.abbreviate("Hello World", 5));
    }
}