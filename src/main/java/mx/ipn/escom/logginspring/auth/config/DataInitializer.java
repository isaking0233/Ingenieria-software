package mx.ipn.escom.logginspring.auth.config;

import mx.ipn.escom.logginspring.auth.entity.Rol;
import mx.ipn.escom.logginspring.auth.repository.RolRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class DataInitializer implements CommandLineRunner {

    private final RolRepository rolRepository;

    public DataInitializer(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> rolesNecesarios = List.of("ROLE_ADMIN", "ROLE_USER");

        // Obtener los roles que ya existen en la base de datos
        Set<String> rolesExistentes = rolRepository.findAll().stream()
                .map(Rol::getNombre)
                .collect(Collectors.toSet());

        // Agregar solo los roles que faltan
        for (String rol : rolesNecesarios) {
            if (!rolesExistentes.contains(rol)) {
                Rol nuevoRol = new Rol();
                nuevoRol.setNombre(rol);
                rolRepository.save(nuevoRol);
                System.out.println("Se creó el rol: " + rol);
            }
        }

        System.out.println("Roles verificados correctamente.");
    }
}
