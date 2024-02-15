import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioServicioTest {

    private UsuarioServicio usuarioServicio;

    /*Creamos un metodo para que se ejecute antes de cada test*/
    @BeforeEach
    public void setUp() {
        usuarioServicio = new UsuarioServicio();
    }

    @DisplayName("Dado un usuario que queremos crear" +
            "Cuando llamamos a 'crearUsuarios'" +
            "Esperamos que el usuario este creado")
    @Test
    public void Test1() {
        UsuarioDTO esperado = new UsuarioDTO(1L, "Eduardo");
        final UsuarioDTO res = usuarioServicio.crearUsuario(1L, "Eduardo");

        Assertions.assertEquals(esperado.id, res.id);
        Assertions.assertEquals(esperado.nombre, res.nombre, "Los nombres son diferentes");
        Assertions.assertEquals(esperado, res);
        /*Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.fail();*/
    }

    @DisplayName("TEST PASS, A pesar de que se creo al usuario" +
            "Los nombres son diferentes")
    @Test
    public void Test2() {
        UsuarioDTO esperado = new UsuarioDTO(1L, "Prueba1");
        final UsuarioDTO res = usuarioServicio.crearUsuario(1L, "Prueba");

        Assertions.assertEquals(esperado.id, res.id);
        Assertions.assertNotEquals(esperado.nombre, res.nombre, "Los nombres son iguales");
        Assertions.assertNotEquals(esperado, res);
    }

    @DisplayName("TEST PASS, por que aun no se ha creado al usuario" +
            "Por lo tanto compara null con null")
    @Test
    public void Test3() {
        final UsuarioDTO res = usuarioServicio.obtenerUsuario(1L);

        Assertions.assertEquals(null, res);
    }

    @DisplayName("TEST PASS, por que previamente se creo al usuario")
    @Test
    public void Test4() {
        UsuarioDTO esperado = new UsuarioDTO(1L, "Nombre");
        usuarioServicio.crearUsuario(1L, "Nombre");
        final UsuarioDTO res = usuarioServicio.obtenerUsuario(1L);

        Assertions.assertEquals(esperado, res);
    }

}
