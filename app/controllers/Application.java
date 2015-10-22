package controllers;

import java.util.*;
import models.*;
import play.*;
import play.mvc.*;

/**
 * Clase principal de la aplicación.
 *
 * @author Oscar Arturo Corona Chavira
 */
@With(Secure.class)
public class Application extends Controller {

    /**
     * Método que renderiza la vista index
     */
    public static void index() {
        String user = Security.connected();
        render(user);
    }

    /**
     * Método que renderiza la vista de login
     */
    public static void login() {

//        List<Usuario> usuarios = Usuario.findAll();
//        Usuario us = new Usuario();
//        for(Usuario usuario : usuarios){
//            System.out.println("usuario = " + usuario);
//        }
//        List<Usuario> usuariosCorona = Usuario.find("primerApellido","Corona").fetch();
//        
//        for(Usuario usuario : usuarios){
//            System.out.println("usuarios coronna = " + usuariosCorona);
//        }
//        
////        usuariosCorona = Usuario.find("primerApellido = ? AND nombre LIKE","Corona","Arturo").fetch();
//        usuariosCorona = Usuario.find("primerApellido = ? AND nombre = ?","Corona","Oscar Arturo").fetch();
        String user = Security.connected();
        render(user);
    }

    /**
     * Método que renderiza la vista index y añade un usuario a la sesión
     */
    public static void autenticar(String usuario, String pass) {
        /*añade un usuario a la sesión
         es mala practica meter objetos enteros en la sesión*/
        session.put("usuario", usuario);
        //renderText("US: %s Pass: %s", usuario, pass);
        index();
    }
}
