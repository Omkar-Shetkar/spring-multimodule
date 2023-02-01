package com.example.api;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceAppAutoConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource appDatasource() {
        return DataSourceBuilder.create().build();
    }


    @Bean
    public SpringLiquibase mainLiquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(appDatasource());
        liquibase.setChangeLog("classpath:liquibase/main.changelog-master.xml");
        return liquibase;
    }
}