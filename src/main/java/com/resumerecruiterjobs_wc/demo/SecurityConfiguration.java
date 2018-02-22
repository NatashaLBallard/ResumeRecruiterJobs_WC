package com.resumerecruiterjobs_wc.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Autowired
    private SSUserDetailsService userDetailsService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception{
        return new SSUserDetailsService(userRepository);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/","/h2-console/**",
                        "/register").permitAll()
                .antMatchers("/applicant").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/employer").access("hasAnyAuthority('EMPLOYER','ADMIN')")
                .antMatchers("/recruiter").access("hasAnyAuthority('RECRUITER','ADMIN')")


                .antMatchers("/display").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/viewcontact").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/addcontact").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/processcontact").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/detail-contact/{id}").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/update-contact/{id}").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/delete-contact/{id}").access("hasAnyAuthority('APPLICANT','ADMIN')")


                .antMatchers("/indexresume").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/contact").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/coverletter").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/education").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/experience").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/reference").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/skill").access("hasAnyAuthority('APPLICANT','ADMIN')")
                .antMatchers("/summary").access("hasAnyAuthority('APPLICANT','ADMIN')")

                .antMatchers("/admin").access("hasAuthority('ADMIN')")

//                .antMatchers("/admin","/applicant","/employer").access("hasAuthority('ADMIN')")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll()
                .and()
                .logout()
                .logoutRequestMatcher(
                        new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login").permitAll().permitAll()
                .and()
                .httpBasic();
        http
                .csrf().disable();
        http
                .headers().frameOptions().disable();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth
                .userDetailsService(userDetailsServiceBean());
    }
}
