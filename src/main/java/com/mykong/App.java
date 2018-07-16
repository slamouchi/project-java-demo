package com.mykong;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
        System.out.println("Hello Sabrine");
        System.out.println("Hello World!");
    }

    public String generateUniqueKey(){

        String id = UUID.randomUUID().toString();
        return id;

    }
}
