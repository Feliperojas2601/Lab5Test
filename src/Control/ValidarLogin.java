
package Control;

import Entidad.Usuario;
import Entidad.Sistema;
import frontera.FramePrincipal;

public class ValidarLogin {
    private Sistema sistema = FramePrincipal.sistema;
    public ValidarLogin(){
        
    }
    public String verificarLogin(Usuario usuario){
        if(!verificarLongitudNombre(usuario.getNombre())){
            return("Longitud nombre incorrecta");
        }
        if(!verificarLongitudPassword(usuario.getPassword())){
            return("Longitud contraseña incorrecta");
        }
        for (Usuario u : sistema.getUsuarios()){
            if (u.getNombre().equals(usuario.getNombre()) && 
                u.getPassword().equals(usuario.getPassword())){
                return("Bienvenido");
            }
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
