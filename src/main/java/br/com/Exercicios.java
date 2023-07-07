package br.com;

import java.util.Optional;
import java.util.stream.Stream;

public class Exercicios {

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5, 6)
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::print);

        System.out.println("\n");

        Optional<String> opt = Optional.of("workover");
        System.out.print(opt.isPresent());
        System.out.print(" ");
        System.out.print(opt.get());

        System.out.println("\n");

        Stream.of(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 0)
                .skip(1)
                .forEach(System.out::print);

        System.out.println("\n");

        Stream.of("a", "b", "c", "d", "e", "f")
                .skip(1)
                .limit(3)
                .forEach(System.out::print);
    }
}
