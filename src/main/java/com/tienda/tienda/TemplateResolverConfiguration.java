
package com.tienda.tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {
    
    
    @Bean
    public SpringResourceTemplateResolver templatesResolver_0 (){
            SpringResourceTemplateResolver templateRevolver = new SpringResourceTemplateResolver
            templateRevolver.setPrefix("classpath:/templates");
            templateRevolver.setSuffix(".html");
            templateRevolver.setTemplateMode(TemplateMode.HTML);
            templateRevolver.setCharacterEncoding("UTF-8");
            templateRevolver.setOrder(0);
            templateRevolver.setCheckExistence(true);
            return templateRevolver;
           
    }
            @Bean
    public SpringResourceTemplateResolver templatesResolver_1 (){
            SpringResourceTemplateResolver templateRevolver = new SpringResourceTemplateResolver
            templateRevolver.setPrefix("templates/categoria");
            templateRevolver.setSuffix(".html");
            templateRevolver.setTemplateMode(TemplateMode.HTML);
            templateRevolver.setCharacterEncoding("UTF-8");
            templateRevolver.setOrder(1);
            templateRevolver.setCheckExistence(true);
            return templateRevolver;
           
    } 
      
     @Bean
    public SpringResourceTemplateResolver templatesResolver_2 (){
            SpringResourceTemplateResolver templateRevolver = new SpringResourceTemplateResolver
            templateRevolver.setPrefix("templates/articulo");
            templateRevolver.setSuffix(".html");
            templateRevolver.setTemplateMode(TemplateMode.HTML);
            templateRevolver.setCharacterEncoding("UTF-8");
            templateRevolver.setOrder(2);
            templateRevolver.setCheckExistence(true);
            return templateRevolver;
           
    }
    
     @Bean
    public SpringResourceTemplateResolver templatesResolver_3 (){
            SpringResourceTemplateResolver templateRevolver = new SpringResourceTemplateResolver
            templateRevolver.setPrefix("templates/cliente");
            templateRevolver.setSuffix(".html");
            templateRevolver.setTemplateMode(TemplateMode.HTML);
            templateRevolver.setCharacterEncoding("UTF-8");
            templateRevolver.setOrder(3);
            templateRevolver.setCheckExistence(true);
            return templateRevolver;
           
    }
}
