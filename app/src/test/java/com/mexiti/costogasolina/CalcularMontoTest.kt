package com.mexiti.costogasolina

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class CalcularMontoTest {

    @Test
    fun calcularMonto23_94_20l(){

        val precio = 23.94
        val cantLitros = 20.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(478.8)
        val montoActual = calcularMonto(precio, cantLitros, darPropina=darPropina, propina= propina)

        assertEquals(montoEsperado, montoActual)
    }

    @Test
    fun calcularMonto22_35_40l(){

        val precio = 22.35
        val cantLitros = 40.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894)
        val montoActual = calcularMonto(precio, cantLitros, darPropina=darPropina, propina= propina)

        assertEquals(montoEsperado, montoActual)
    }
}