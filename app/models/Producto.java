package models;

import javax.persistence.Entity;
import play.data.validation.Required;
import play.db.jpa.Model;

/**
 *Modelo entidad para la tabla Producto.
 * @author Oscar Arturo Corona Chavira
 */
@Entity
public class Producto extends Model {

    @Required
    public String clave;

    @Required
    public Double precio;

    @Required
    public String descripcion;

}
