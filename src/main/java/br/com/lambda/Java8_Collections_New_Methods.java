package br.com.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

/**
 * JAVA 8 - Novos métodos em Collections
 */
public class Java8_Collections_New_Methods {

    public static void main(String[] args) {

        // List
        System.out.println("List");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // forEach
        System.out.println("forEach");
        list.forEach(n -> System.out.println(n));

        // removeIf
        System.out.println("\n" + "removeIf");
        list.removeIf(n -> n% 2 == 0);
        list.forEach(n -> System.out.println(n));

        // replaceAll
        System.out.println("\n" + "replaceAll");
        list.replaceAll(n -> n * 2);
        list.forEach(n -> System.out.println(n));

        // Map
        System.out.println("\n" + "Map");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Você");
        map.put(1, "consegue");
        map.put(2, "chegar");
        map.put(3, "lá!");

        // forEach
        System.out.println("\n" + "forEach Map");
        map.forEach((k, v) -> System.out.println(k + v));

        // compute  Map
        System.out.println("\n" + "compute Map");
        map.compute(1, (k, v) -> v + " agora");
        map.forEach((k, v) -> System.out.println(k + v));

        // merge Map
        System.out.println("\n" + "merge Map");
        map.merge(4, "!", (v1, v2) -> v1 + v2);
        map.forEach((k, v) -> System.out.println(k + v));

        // replaceAll Map
        System.out.println("\n" + "replaceAll Map");
        map.replaceAll((k, v) -> v + "!");
        map.forEach((k, v) -> System.out.println(k + v));
    }
}
