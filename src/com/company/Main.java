package com.company;

import java.util.*;

public class Main {

    private static Object City;

    public static void main(String[] args) {
//        City деген класс тузунуз. (code, name, ...)
//        Эгерде code так сан болсо TreeSetke салыныз.
//                Аларды чонунан кичинесине караган тартипте чыгарыныз.


Set<City>citySet=new TreeSet<>();
        citySet.add(new City(6,"Canada"));
        citySet.add(new City(9,"Bishkek"));
        citySet.add(new City(1,"Рассия"));
        citySet.add(new City(4,"Туркия"));
        citySet.add(new City(7,"Казакстан"));
        for (City s:citySet
             ) {
            if(s.getCode()%2==1){
                Set<City>citySet1=new TreeSet<>();
                citySet1.add(s);
                System.out.println(citySet1);
            }

        }
    }}
