package com.ieschabas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la clase MenuVehiculos.
 */
public class MenuVehiculosTest {

    MenuVehiculos menuVehiculos = new MenuVehiculos();
    @Test
    void testOpcion1() {
        assertEquals("Mantenimiento de clientes", menuVehiculos.seleccionarOpcion(1));
    }

    @Test
    void testOpcion2() {
        assertEquals("Introducción de facturas", menuVehiculos.seleccionarOpcion(2));
    }

    @Test
    void testOpcion3() {
        assertEquals("Listado de facturas", menuVehiculos.seleccionarOpcion(3));
    }

    @Test
    void testOpcion4() {
        assertEquals("Finalizar", menuVehiculos.seleccionarOpcion(4));
    }

    @Test
    void testOpcionInvalida() {
        assertEquals("La opción no existe. Vuelve a intentarlo", menuVehiculos.seleccionarOpcion(7));
    }
}

