package com.curso.v7;

import java.util.*;

public class NonGenericsCode {
    public static void main(String[] args) {
        List languages = new ArrayList();
        languages.add(23);
        Object value = new String("Swedish");
        languages.add(value);
        processLanguages(languages);
    }

    private static void processLanguages(List data){
        String language = (String)data.get(0);
        System.out.println(language);
    }
}