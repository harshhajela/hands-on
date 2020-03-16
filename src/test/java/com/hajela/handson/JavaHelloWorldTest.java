package com.hajela.handson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void getHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals ("Hello World!", javaHelloWorld.getHelloWorld());
        System.out.println("Junit4 test running");
    }
}