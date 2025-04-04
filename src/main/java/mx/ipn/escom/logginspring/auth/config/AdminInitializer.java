package mx.ipn.escom.logginspring.auth.config;

import mx.ipn.escom.logginspring.auth.entity.Rol;
import mx.ipn.escom.logginspring.auth.entity.Usuario;
import mx.ipn.escom.logginspring.auth.repository.RolRepository;
import mx.ipn.escom.logginspring.auth.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class AdminInitializer implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        String correo = "admin2@gmail.com";

        if (usuarioRepository.findByEmail(correo) == null) {
            // Asegurarse que el rol ADMIN exista
            Rol rolAdmin = rolRepository.findByNombre("ROLE_ADMIN")
                    .orElseGet(() -> {
                        Rol nuevoRol = new Rol();
                        nuevoRol.setNombre("ROLE_ADMIN");
                        return rolRepository.save(nuevoRol);
                    });

            Usuario admin = new Usuario();
            admin.setNombre("admin");
            admin.setEmail(correo);
            admin.setPassword(passwordEncoder.encode("admin"));
            admin.setRoles(Collections.singleton(rolAdmin));

            usuarioRepository.save(admin);
            System.out.println("✅ Usuario admin creado correctamente");
        } else {
            System.out.println("ℹ️ Usuario admin ya existe");
        }
    }
}