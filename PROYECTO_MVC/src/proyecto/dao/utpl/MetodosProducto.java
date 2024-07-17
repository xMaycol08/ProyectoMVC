
package proyecto.dao.utpl;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.modelo.utpl.Producto;


public class MetodosProducto implements IProducto {
    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection<Document> collection;

    public MetodosProducto() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.collection = database.getCollection("Producto");
        }
    }
    private void cierreConexion() {
        try {
            conn.close();
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.toString());
        }
    }

    @Override
    public boolean GuardarProducto(Producto producto) {
        //pasos para guardar el producto
        return false;
    }

    @Override
    public Producto MostrarTabla(String cedula) {
        //pasos para mostrar datos de la base a la tabla
        return null;
    }

    @Override
    public int CalcularIntereses(int total) {
        //metodo polimorfico nose pa que
        return 0;
    }
    
}
