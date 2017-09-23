/*
 * SortServiceImpl.java
 */
package com.sample.kensyuu.service.impl;

import org.hamcrest.core.Is;

import com.sample.kensyuu.service.*;

/**
 * 
 * sort service imple
 * 
 * @author s.h
 */
public class SortServiceImpl implements SortService {

    /**
     * 引数で受け取った配列を昇順に並び替えて返却する
     * 
     * @param number
     * @return
     */
    public int[] doSort(int[] numbers) {

        if(numbers == null) {
            System.out.println("配列がnullです");
            return numbers;
        }
        
        int int_one  = 1;
        int n = numbers.length;
                
        // 処理書く
        for(int b = n-1; b >= int_one; b--) {
            for(int a = n-1; a >= int_one; a--) {
                if(numbers[a] < numbers[a-1]) {
                    int temp;
                    temp = numbers[a];
                    numbers[a] = numbers[a-1];
                    numbers[a-1] = temp;
                }   
            }
        }
    return numbers;
    }
}