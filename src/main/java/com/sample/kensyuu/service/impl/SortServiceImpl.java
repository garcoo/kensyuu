/*
 * SortServiceImpl.java
 */
package com.sample.kensyuu.service.impl;

import com.sample.kensyuu.service.*;

/**
 * 
 * sort service imple
 * 
 * @author k-t
 */
public class SortServiceImpl implements SortService {

    /**
     * 引数で受け取った配列を昇順に並び替えて返却する
     * 
     * @param number
     * @return
     */
    public int[] doSort(int[] values) {

         int[] vals = values;
            if ( vals == null || vals.length == 0 ) return vals;         
            int temp=0;
            for ( int i = 0; i < vals.length - 1; i++ ) {
                for ( int j = vals.length - 1; j > i; j-- ) {
                    if ( vals[j - 1] > vals[j] ) {
                        temp = vals[j - 1];
                        vals[j - 1] = vals[j];
                        vals[j] = temp;
                    }
                }
            }

        return values;
    }
}