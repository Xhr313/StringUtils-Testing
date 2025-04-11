package org.apache.commons.lang3;

public class ManualStringUtilsTest {
    public static void main(String[] args) {
        System.out.println("----- 开始手动测试 -----");

        // 测试 reverse 缺陷
        testReverseDefect();

        // 测试 isBlank
        testIsBlank();

        // 测试 abbreviate
        testAbbreviate();

        System.out.println("----- 测试结束 -----");
    }

    private static void testReverseDefect() {
        String input = "12345";
        String result = StringUtils.reverse(input);
        System.out.println("输入: " + input + ", 反转结果: " + result);

        if ("54321".equals(result)) {
            System.out.println("【错误】reverse 方法意外正确");
        } else {
            System.out.println("【通过】检测到缺陷：实际结果=" + result);
        }
    }

    private static void testIsBlank() {
        String testStr = "   ";
        boolean result = StringUtils.isBlank(testStr);
        System.out.println("测试 isBlank(\"   \")：" + result);
        System.out.println(result ? "【通过】正确识别空白字符串" : "【错误】判断失败");
    }

    private static void testAbbreviate() {
        String text = "Hello World";
        String result = StringUtils.abbreviate(text, 5);
        System.out.println("缩写测试：" + result);
        if ("Hello...".equals(result)) {
            System.out.println("【通过】缩写正确");
        } else {
            System.out.println("【错误】预期'Hello...'，实际：" + result);
        }
    }
}
