
package Control;

import DAO.UsuarioDAO;
import Entidad.Usuario;
import Entidad.Sistema;
import frontera.FramePrincipal;

public class ValidarLogin {
    private UsuarioDAO dao = new UsuarioDAO();
    public ValidarLogin(){
    }
    public String verificarLogin(Usuario usuario){
        if(!verificarLongitudNombre(usuario.getNombre())){
            return("Longitud nombre incorrecta");
        }
        if(!verificarLongitudPassword(usuario.getPassword())){
            return("Longitud contraseña incorrecta");
        }
        if(dao.leer(usuario)!=null){
            return ("Bienvenido");
        }
        return("Datos incorrectos");
    }
    public boolean verificarLongitudNombre(String nombre){
        return (nombre.length()>1 && nombre.length()<7); 
    }
    public boolean verificarLongitudPassword(String password){
        return (password.length()>2 && password.length()<6);
    }
}
