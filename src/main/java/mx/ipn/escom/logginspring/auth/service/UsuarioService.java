package mx.ipn.escom.logginspring.auth.service;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import mx.ipn.escom.logginspring.auth.entity.Usuario;
import mx.ipn.escom.logginspring.auth.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import mx.ipn.escom.logginspring.auth.repository.RolRepository;
import mx.ipn.escom.logginspring.auth.entity.Rol;



@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registrarUsuario(Usuario usuario) {
        // Codifica la contraseña
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        // Buscar el rol "ROLE_USER"
        Rol rolUsuario = rolRepository.findByNombre("ROLE_USER")
                .orElseThrow(() -> new RuntimeException("Rol 'ROLE_USER' no encontrado"));

        // Asignar el rol al usuario
        usuario.getRoles().add(rolUsuario);

        // Guardar usuario con rol
        usuarioRepository.save(usuario);
    }
}
