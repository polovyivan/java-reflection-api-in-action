package com.polovyi.ivan.tutorials;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {

    public static void main(String[] args) {

        Map<String, UserStats> visits1 = Map.of("1", new UserStats(5L));
        Map<String, UserStats> visits2 = Map.of("2", new UserStats(5L));

        Map<Long, Long> count = new Challenge().count(visits1, visits2);
        System.out.println("count = " + count);
    }

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long, Optional<Long>> collect = Arrays.asList(visits).stream()
                .flatMap(m -> m.entrySet().stream())
                .filter(el -> el != null && el.getKey().matches("\\d*"))
                .collect(Collectors.toMap(e -> Long.parseLong(e.getKey()),
                        v -> v.getValue().getVisitCount(),
                        (value1, value2) -> Stream.of(value1.orElse(0L), value2.orElse(0L))
                                .reduce(Long::sum)));

        return collect.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey(),
                v -> v.getValue().orElse(0L)));
    }

}
