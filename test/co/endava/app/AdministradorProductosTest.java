package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    void testComidaSinVencer() {
        int descuento;
        descuento = 0;
        Comida sin_vencer = new Comida(103, "atun", 3000, LocalDate.now().minusDays(2));
        assertEquals(descuento, sin_vencer.getDescuento());
        System.out.println(sin_vencer.getDescuento());
    }
    @Test
    void testVenceFechaActual() {
        int descuento;
        descuento = (800*10)/100;
        Comida vence_hoy = new Comida(451, "jamón", 800, LocalDate.now());
        assertEquals(descuento, vence_hoy.getDescuento());
        System.out.println(vence_hoy.getDescuento());
    }
    @Test
    void testVencida(){
        int descuento;
        descuento = (1500*10)/100;
        Comida vencida = new Comida(451, "leche", 1500, LocalDate.now().plusDays(5));
        System.out.println(vencida.getDescuento());
        assertEquals(descuento, vencida.getDescuento());
    }
}