/*
 * SortServiceImpl.java
 */
package com.sample.kensyuu.service.impl;

import java.util.*;

import com.sample.kensyuu.service.*;

/**
 * 
 * soer service imple
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

        /** 例：入れ替えていく **/

        // 結果を返す用の入れ物作る
        int[] result = new int[numbers.length];
        // データを扱いやすくするためにListへ変換
        List<Integer> tempList = toList(numbers);

        int minNumber = 0; // [変数宣言]最小値
        int minCount = 0; // [変数宣言]最小値が格納されている要素番号
        for (int i = 0; i < numbers.length; i++) {
            // 対象の数だけ繰り返す
            for (int j = 0; j < tempList.size(); j++) {
                if (j == 0) {
                    // 初回の場合は基準として保持する
                    minNumber = tempList.get(j);
                    minCount = j;
                    continue;
                }
                if (minNumber > tempList.get(j)) {
                    // 保持している最小値よりも小さい場合は入れ替える
                    minNumber = tempList.get(j);
                    minCount = j;
                }
            }
            // 最小のものを結果配列に追加
            result[i] = minNumber;
            // 結果配列に追加したものを検査対象から除外
            tempList.remove(minCount);
        }

        return result;
    }

    /**
     * 配列をlistに変換する
     * 
     * @param arr
     * @return ArrayList
     */
    private ArrayList<Integer> toList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int tmp : arr) {
            list.add(tmp);
        }
        return list;
    }
}