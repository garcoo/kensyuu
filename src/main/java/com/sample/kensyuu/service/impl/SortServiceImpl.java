/*
 * SortServiceImpl.java
 */
package com.sample.kensyuu.service.impl;

import com.sample.kensyuu.service.*;

/**
 * 
 * sort service imple
 * 
 * @author t-coga
 */
public class SortServiceImpl implements SortService {

    /**
     * 引数で受け取った配列を昇順に並び替えて返却する
     * 
     * @param number
     * @return
     */
    public int[] doSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; i < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int number = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = number;
                }
            }
        }
        // 処理書く
        return numbers;
    }
}