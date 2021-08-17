package br.com.dio.javafuncional;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificaSeMaior=
                (parametro, valorComparacao)->parametro>valorComparacao;
        System.out.println(verificaSeMaior.test(12,13));
        System.out.println(verificaSeMaior.test(13,12));
    }
}
