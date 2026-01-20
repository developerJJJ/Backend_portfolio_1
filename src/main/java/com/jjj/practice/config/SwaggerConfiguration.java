import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI myApiConfiguration() {
        return new OpenAPI()
                .info(new Info()
                        .title("E-Commerce API")
                        .description("Documentation for the Shopping Cart Service")
                        .version("v1.2.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}