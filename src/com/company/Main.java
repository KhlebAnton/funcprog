package com.company;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final String messageAborigine = "monaga rexzo uni uno spirr faars qenu arm bong chi fay";
        System.out.println(Arrays.toString(generationWordbook(messageAborigine)));
    }

    private static String[] generationWordbook(String message) {
        Function<String, String[] > wordbook = x -> Stream.of(message.split(" "))
                .sorted()
                .toArray(String[]::new);
        return wordbook.apply(message);
    }
}