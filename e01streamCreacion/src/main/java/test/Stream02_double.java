package test;

import dto.Tutoriales;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Stream02_double {

    public static void main(String[] args) {

        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);

        System.out.println("doubleStream = " + doubleStream.boxed().toList());
    }
}
