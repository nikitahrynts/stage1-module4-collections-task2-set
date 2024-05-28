package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> first = new HashSet<>(firstSet);
        first.retainAll(secondSet);
        first.removeAll(thirdSet);
        Set<String> second = new HashSet<>(thirdSet);
        second.removeAll(firstSet);
        second.removeAll(secondSet);
        Set<String> resultSet = new HashSet<>(first);
        resultSet.addAll(second);
        return resultSet;
    }
}
