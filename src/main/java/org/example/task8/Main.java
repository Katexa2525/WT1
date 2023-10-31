package org.example.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double[] sequenceA = {1, 3, 5, 7, 9};
        double[] sequenceB = {2, 4, 6, 8, 10};

        List<Integer> insertPositions = findInsertPositions(sequenceA, sequenceB);
        System.out.println("Insert Positions: " + insertPositions);
    }

    public static List<Integer> findInsertPositions(double[] sequenceA, double[] sequenceB) {
        List<Integer> insertPositions = new ArrayList<>();
        int i = 0; // Индекс для sequenceA
        int j = 0; // Индекс для sequenceB

        while (i < sequenceA.length && j < sequenceB.length) {
            if (sequenceA[i] <= sequenceB[j]) {
                i++;
            } else {
                insertPositions.add(i);
                j++;
            }
        }

        while (j < sequenceB.length) {
            insertPositions.add(i);
            j++;
        }

        return insertPositions;
    }
}