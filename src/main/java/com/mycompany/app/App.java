package com.mycompany.app;

/**
 * Hello Jenkins world! Welcome!
 */
public class App
{

    private final String message = "Hello Jenkins World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
