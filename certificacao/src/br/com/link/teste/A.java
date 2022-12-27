package br.com.link.teste;


import java.util.*;
class A {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0;i<10;i++)
            for(int j=0;j<10;i++)
                strings.add("string " + i + " " + j);
        System.out.println(strings.get(99999));
    }
}