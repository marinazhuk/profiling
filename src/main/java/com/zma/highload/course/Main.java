package com.zma.highload.course;

import java.util.List;
import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) throws InterruptedException {
        List<Integer> values = generateRandomValues(100000, 2000000);
        List<Integer> values1 = generateRandomValues(100000, 4000000);
        List<Integer> values2 = generateRandomValues(100000, 6000000);
        List<Integer> values3 = generateRandomValues(100000, 8000000);
        List<Integer> values4 = generateRandomValues(100000, 10000000);
        List<Integer> values5 = generateRandomValues(100000, 12000000);
        List<Integer> values6 = generateRandomValues(100000, 14000000);
        List<Integer> values7 = generateRandomValues(100000, 16000000);
        List<Integer> values8 = generateRandomValues(100000, 18000000);
        List<Integer> values9 = generateRandomValues(100000, 20000000);

        AVLTree tree = createBBSTTree1(generateRandomValues(1000000, 2000000));
        //testSearch0(tree, values);
        testDelete0(tree, values);
        testInsert0(tree, values);

        tree = createBBSTTree1(generateRandomValues(2000000, 4000000));
        //testSearch1(tree, values1);
        testDelete1(tree, values1);
        testInsert1(tree, values1);

        tree = createBBSTTree1(generateRandomValues(3000000, 6000000));
        //testSearch2(tree, values2);
        testDelete2(tree, values2);
        testInsert2(tree, values2);

        tree = createBBSTTree1(generateRandomValues(4000000, 8000000));
        //testSearch3(tree, values3);
        testDelete3(tree, values3);
        testInsert3(tree, values3);

        tree = createBBSTTree1(generateRandomValues(5000000, 10000000));
        //testSearch4(tree, values4);
        testDelete4(tree, values4);
        testInsert4(tree, values4);

        tree = createBBSTTree1(generateRandomValues(6000000, 12000000));
        //testSearch5(tree, values5);
        testDelete5(tree, values5);
        testInsert5(tree, values5);

        tree = createBBSTTree1(generateRandomValues(7000000, 14000000));
        //testSearch6(tree, values6);
        testDelete6(tree, values6);
        testInsert6(tree, values6);

        tree = createBBSTTree1(generateRandomValues(8000000, 16000000));
        //testSearch7(tree, values7);
        testDelete7(tree, values7);
        testInsert7(tree, values7);

        tree = createBBSTTree1(generateRandomValues(9000000, 18000000));
        //testSearch8(tree, values8);
        testDelete8(tree, values8);
        testInsert8(tree, values8);

        tree = createBBSTTree1(generateRandomValues(10000000, 20000000));
        //testSearch9(tree, values9);
        testDelete9(tree, values9);
        testInsert9(tree, values9);
    }

    private static void testInsert0(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }

    private static void testInsert1(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }
    private static void testInsert2(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }
    private static void testInsert3(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }
    private static void testInsert4(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }
    private static void testInsert5(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }
    private static void testInsert6(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }
    private static void testInsert7(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }
    private static void testInsert8(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }
    private static void testInsert9(AVLTree tree, List<Integer> values) {
        testInsert(tree, values);
    }

    private static void testInsert(AVLTree tree, List<Integer> values) {
        for (int value : values) {
            tree.insert(value);
        }
    }

    private static void testSearch0(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch1(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch2(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch3(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch4(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch5(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch6(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch7(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch8(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }
    private static void testSearch9(AVLTree tree, List<Integer> values) {
        testSearch(tree, values);
    }

    private static void testSearch(AVLTree tree, List<Integer> values) {
        for (int value : values) {
            tree.find(value);
        }
    }

    private static void profileMemoryUsage() {
        createBBSTTree1(generateRandomValues(10000, 100000));
        createBBSTTree2(generateRandomValues(20000, 200000));
        createBBSTTree3(generateRandomValues(30000, 300000));
        createBBSTTree4(generateRandomValues(40000, 400000));
        createBBSTTree5(generateRandomValues(50000, 500000));
        createBBSTTree6(generateRandomValues(60000, 600000));
        createBBSTTree7(generateRandomValues(70000, 700000));
        createBBSTTree8(generateRandomValues(80000, 800000));
        createBBSTTree9(generateRandomValues(90000, 900000));
        createBBSTTree10(generateRandomValues(100000, 1000000));
    }

    private static void testDelete0(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete1(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete2(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete3(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete4(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete5(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete6(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete7(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete8(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }
    private static void testDelete9(AVLTree tree, List<Integer> values) {
        deleteFromTree(tree, values);
    }

    private static void deleteFromTree(AVLTree tree, List<Integer> values) {
        for (int value : values) {
            tree.delete(value);
        }
    }

    private static AVLTree createBBSTTree1(List<Integer> values) {
        return createBBSTTree(values);
    }

    private static void createBBSTTree2(List<Integer> values) {
        createBBSTTree(values);
    }
    private static void createBBSTTree3(List<Integer> values) {
        createBBSTTree(values);
    }
    private static void createBBSTTree4(List<Integer> values) {
        createBBSTTree(values);
    }

    private static void createBBSTTree5(List<Integer> values) {
        createBBSTTree(values);
    }

    private static void createBBSTTree6(List<Integer> values) {
        createBBSTTree(values);
    }

    private static void createBBSTTree7(List<Integer> values) {
        createBBSTTree(values);
    }

    private static void createBBSTTree8(List<Integer> values) {
        createBBSTTree(values);
    }

    private static void createBBSTTree9(List<Integer> values) {
        createBBSTTree(values);
    }

    private static void createBBSTTree10(List<Integer> values) {
        createBBSTTree(values);
    }

    private static List<Integer> generateRandomValues(int size, int maxValue) {
        return RANDOM.ints(0, maxValue)
                .distinct()
                .limit(size)
                .boxed()
                .toList();
    }

    private static AVLTree createBBSTTree(List<Integer> values) {
        AVLTree avlTree = new AVLTree();
        for (int val : values) {
            avlTree.insert(val);
        }
        return avlTree;
    }

}