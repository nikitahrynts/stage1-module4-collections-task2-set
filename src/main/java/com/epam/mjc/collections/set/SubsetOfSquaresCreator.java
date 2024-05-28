package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        for (Integer i : sourceList) {
            resultSet.add(i * i);
        }
        return resultSet.subSet(lowerBound, true, upperBound, true);
    }
}
