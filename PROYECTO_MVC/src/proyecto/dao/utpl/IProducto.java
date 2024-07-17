
package proyecto.dao.utpl;

import java.awt.List;
import proyecto.modelo.utpl.Producto;


public interface IProducto {
    public boolean GuardarProducto(Producto producto);
    public Producto MostrarTabla(String cedula);
    public int CalcularIntereses(int total);
    
    
    
}
