package tn.esprit.pi.security;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomizationPortAndPath implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
 
    @Override
    public void customize(ConfigurableServletWebServerFactory server) {
        server.setPort(8093);
        server.setContextPath("/SpringMVC");
    }

 
}