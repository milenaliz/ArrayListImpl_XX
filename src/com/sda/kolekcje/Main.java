package com.sda.kolekcje;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CustomList<String> lista = new CustomList<>();

        lista.add("Jan");
        lista.add("Maciej");

    for (int i=0; i<lista.size(); i++){
        System.out.println(lista.get(i));
    }
}}
