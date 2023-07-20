package Desafios.Desafio_2.Main;

import Desafios.Desafio_2.Entidades.Alquiler;
import Desafios.Desafio_2.Services.AlquilerService;

import java.util.Collections;
import java.util.HashSet;

public class main2 {



    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Audi");

        System.out.println(cars);

        for (String i : cars) {
            System.out.println(i);
        }
        for (String i : cars) {
            System.out.println(i.hashCode());
        }
    }
    }
