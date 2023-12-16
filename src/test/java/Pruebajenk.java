/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.Gabrieljenk;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gabri
 */
public class Pruebajenk {
    
    public Pruebajenk() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   /* @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of dia_laboral method, of class Pruebaunitaria.
     */
    @org.junit.jupiter.api.Test
    public void testDia_laboral1() {
        System.out.println("dia_laboral:Lunes");
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = Gabrieljenk.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
