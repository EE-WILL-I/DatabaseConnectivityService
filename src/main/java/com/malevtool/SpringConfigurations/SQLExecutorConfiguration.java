package com.malevtool.SpringConfigurations;

import Utils.Properties.PropertyReader;
import Utils.Properties.PropertyType;
import com.malevtool.Connection.DatabaseConnector;
import com.malevtool.Proccessing.SQLExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SQLExecutorConfiguration {
    @Bean
    @Scope("singleton")
    public SQLExecutor sqlExecutor() {
        return new SQLExecutor(DatabaseConnector.getConnection(), PropertyReader.getPropertyValue(PropertyType.DATABASE, "sql.path"));
    }
}
