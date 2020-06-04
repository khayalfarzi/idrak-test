package az.company.idraktest;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {

        String[][] mappings = {
                {"/", "menu"}
                , {"/admin", "admin"}
                , {"/home", "home"}
                , {"/news", "news"}
                , {"/user", "user"}
        };
        for (String[] site : mappings) {
            registry.addViewController(site[0]).setViewName(site[1]);
        }
    }
}