package com.apress.cems.config;

import com.apress.cems.pojos.repos.DetectiveRepo;
import com.apress.cems.repos.JdbcDetectiveRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.apress.cems.repos"})
public class ReposConfig {

    @Bean
    DetectiveRepo detectiveRepo(DataSource dataSource) {
        return new JdbcDetectiveRepo(dataSource);
    }
}
