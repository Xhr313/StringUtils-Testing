package com.homework;

public class quickSort {

    public static void sort(int[] arr)
    {
        // 边界检查
        if (arr == null || arr.length == 0)
        {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high)
    {
        // 递归终止条件
        if (low >= high) return;
        int pivot = partition(arr, low, high);
        // 左半部分
        quickSort(arr, low, pivot - 1);
        // 右半部分
        quickSort(arr, pivot + 1, high);
    }

    //分治思想
    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high]; // 选择最后一个元素为枢轴
        int i = low - 1;
        for (int j = low; j < high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    //交换元素
    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}