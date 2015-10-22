package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.*;
import play.db.jpa.Model;
import play.data.validation.Required;

/**
 * Modelo entidad para la tabla Usuario.
 *
 * @author Oscar Arturo Corona Chavira
 */
@Entity
public class Usuario extends Model {

    @Required
    @MaxSize(10)
    public String usuario;

    @Required
    @Email
    public String email;

    @Required
    @Password
    public String password;

    public String aPaterno;
    public String aMaterno;
    public String nombre;

    @InPast
    public Date fechaNacimiento;

    @Override
    /**
     * Método que sobreescribe al metodo {@code toString} por defecto.
     */
    public String toString() {
        return String.format("%s %s %s", this.nombre, this.aPaterno,
                this.aMaterno);
    }

}
