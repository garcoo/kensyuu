/*
 * SortServiceImpleTest.java.java
 */
package com.sample.kensyuu.service.impl;

import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.*;

import com.sample.kensyuu.service.*;

/**
 * 
 * sort service impl test
 * 
 * @author t-coga
 */
public class SortServiceImpleTest {

    @Test
    public void testShuffle() {

        final int count = 10000;
        System.out.println("test start");
        SortService obj = new SortServiceImpl();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        long start = System.currentTimeMillis();
        int[] result = obj.doSort(toArr(list));
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        assertTrue(result.length == count);
        for (int i = 0; i < count; i++) {
            assertTrue(result[i] == i);
        }
        System.out.println("test end");
    }

    @Test
    public void testAsc() {

        final int count = 10000;
        System.out.println("test start");
        SortService obj = new SortServiceImpl();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        int[] result = obj.doSort(toArr(list));
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        assertTrue(result.length == count);
        for (int i = 0; i < count; i++) {
            assertTrue(result[i] == i);
        }
        System.out.println("test end");
    }

    @Test
    public void testDesc() {

        final int count = 10000;
        System.out.println("test start");
        SortService obj = new SortServiceImpl();

        List<Integer> list = new ArrayList<>();
        for (int i = count - 1; i >= 0; i--) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        int[] result = obj.doSort(toArr(list));
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        assertTrue(result.length == count);
        for (int i = 0; i < count; i++) {
            assertTrue(result[i] == i);
        }
        System.out.println("test end");
    }

    private int[] toArr(List<Integer> list) {
        int size = list.size();
        int[] arr = new int[size];
        Iterator<Integer> iter = list.iterator();
        for (int i = 0; i < size; i++)
            arr[i] = iter.next();
        return arr;
    }
}