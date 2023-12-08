package com.example;

import io.javalin.Javalin;

public class App 
{
    public static void main( String[] args )
    {
        // Erstelle eine Javalin-App
        Javalin app = Javalin.create();

        // Definiere eine Route
        

        // Starte den Server auf Port 7000
        app.start(7000);
    }
}
