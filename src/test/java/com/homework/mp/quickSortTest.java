package com.homework.mp;
import com.homework.quickSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class quickSortTest {

    @Test
    public void testEmptyArray() {
        System.out.println("--- 测试空数组 ---");
        int[] arr = {};
        quickSort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
        System.out.println("空数组测试通过 ✅\n");
    }

    @Test
    public void testSingleElement() {
        System.out.println("--- 测试单个元素数组 ---");
        int[] arr = {5};
        System.out.println("排序前: " + arrayToString(arr));
        quickSort.sort(arr);
        System.out.println("排序后: " + arrayToString(arr));
        assertArrayEquals(new int[]{5}, arr);
        System.out.println("单个元素测试通过 ✅\n");
    }

    @Test
    public void testSortedArray() {
        System.out.println("--- 测试已排序数组 ---");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("排序前: " + arrayToString(arr));
        quickSort.sort(arr);
        System.out.println("排序后: " + arrayToString(arr));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        System.out.println("已排序数组测试通过 ✅\n");
    }

    @Test
    public void testReverseSortedArray() {
        System.out.println("--- 测试逆序数组 ---");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("排序前: " + arrayToString(arr));
        quickSort.sort(arr);
        System.out.println("排序后: " + arrayToString(arr));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        System.out.println("逆序数组测试通过 ✅\n");
    }

    @Test
    public void testRandomArray() {
        System.out.println("--- 测试随机数组 ---");
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("排序前: " + arrayToString(arr));
        quickSort.sort(arr);
        System.out.println("排序后: " + arrayToString(arr));
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5, 6, 9}, arr);
        System.out.println("随机数组测试通过 ✅\n");
    }

    @Test
    public void testArrayWithDuplicates() {
        System.out.println("--- 测试重复元素数组 ---");
        int[] arr = {2, 2, 2, 1, 1, 1};
        System.out.println("排序前: " + arrayToString(arr));
        quickSort.sort(arr);
        System.out.println("排序后: " + arrayToString(arr));
        assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2}, arr);
        System.out.println("重复元素数组测试通过 ✅\n");
    }

    @Test
    public void testNullArray() {
        System.out.println("--- 测试 null 输入 ---");
        try {
            quickSort.sort(null);
            System.out.println("未抛出异常，代码允许传入 null ❗");
        } catch (NullPointerException e) {
            System.out.println("捕获到 NullPointerException: " + e.getMessage());
            fail("原始代码未处理 null 输入，需要改进！");
        } catch (IllegalArgumentException e) {
            System.out.println("捕获到 IllegalArgumentException: " + e.getMessage());
            System.out.println("null 输入测试通过 ✅\n");
        }
    }

    // 辅助方法：将数组转换为可读字符串
    @Test
    private String arrayToString(int[] arr) {
        if (arr == null) return "null";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}