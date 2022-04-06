
package com.tienda.tienda;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWedSegurity
public class SegurityConfig extends WedSegurityConfigurerAdapter {
     @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("juan")
                    .password("{noop}123")
                    .roles("ADMIN","VENDEDOR","USER")
                .and()
                .withUser("rebeca")
                    .password("{noop}123")
                    .roles("VENDEDOR","USER")
                .and()
                .withUser("pedro")
                    .password("{noop}123")
                    .roles("USER");
    }
}
}
