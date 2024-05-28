package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 1 || integer % 2 == -1) {
                hashSet.add(integer);
                hashSet.add(2 * integer);
            } else {
                hashSet.add(integer);
                while (integer % 2 == 0) {
                    integer /= 2;
                    hashSet.add(integer);
                }
            }
        }
        return hashSet;
    }
}
