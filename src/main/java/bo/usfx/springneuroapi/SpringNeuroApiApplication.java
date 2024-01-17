package bo.usfx.springneuroapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringNeuroApiApplication {
    protected SpringNeuroApiApplication() {
        // Constructor privado para prevenir la instanciación
    }
    public static void main(final String[] args) {
        SpringApplication.run(SpringNeuroApiApplication.class, args);
    }
}
