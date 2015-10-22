package controllers;

import models.Usuario;

/**
 * Clase proovedora tipo Security
 *
 * @author arturo
 */
public class Security extends Secure.Security {

    /**
     * Método que sobreescribe al método {@code authenticate} por defecto; añade
     * seguridad verificando que el usuario exista y que su contraseña sea
     * correcta.
     *
     * @param username
     * @param password
     * @return
     */
    static boolean authenticate(String username, String password) {
        Usuario user = Usuario.find("nombre", username).first();
        return user != null && user.password.equals(password);
    }
}
