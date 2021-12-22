package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int econom = Integer.parseInt(r.readLine());
        int econom1 = Integer.parseInt(r.readLine());
        int business = Integer.parseInt(r.readLine());
        String jet = r.readLine();
        String airliner1 = r.readLine();
        String airliner2 = r.readLine();
        printAirplaneInfo(jet);
        printAirplaneInfo(econom, airliner1);
        printAirplaneInfo(econom1, business, airliner2);
    }


    public static void printAirplaneInfo(String model) {

        System.out.println("Jet, модель:" + model);
    }

    public static void printAirplaneInfo(int econom, String model) {
        System.out.println("Airliner, модель:" + model + ", кол. пасажиров эконом класса:" + econom);
    }


    public static void printAirplaneInfo(int econom, int business, String model) {
        System.out.println("Airliner, модель: Boeing 777" + model + ", кол. пасажиров эконом класса:" + econom + " пассажиров бизне скласса:" + business);
    }

}



