package org.apache.commons.lang3;

public class StringUtils {
    public static String reverse(final String str) {
        if (str == null) return null;
        char[] chars = str.toCharArray();
        int length = chars.length;
        // ▼▼▼▼▼▼▼▼▼▼ 注入的缺陷 ▼▼▼▼▼▼▼▼▼▼
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - i - 2]; // 错误索引：-2导致最后一个字符不变
            chars[length - i - 2] = temp;
        }
        // ▲▲▲▲▲▲▲▲▲▲ 缺陷代码 ▲▲▲▲▲▲▲▲▲▲
        return new String(chars);
    }

    /**
     * 判断字符串是否为空或空白
     */
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 将字符串缩写
     */
    public static String abbreviate(final String str, final int maxWidth) {
        if (str == null) {
            return null;
        }
        if (maxWidth < 4) {
            throw new IllegalArgumentException("Minimum abbreviation width is 4");
        }
        if (str.length() <= maxWidth) {
            return str;
        }
        return str.substring(0, maxWidth - 3) + "...";
    }
}

// ... 其他方法保持不变 ...}
