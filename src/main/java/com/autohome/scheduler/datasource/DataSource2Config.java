package com.autohome.scheduler.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * Created by summer on 2016/11/25.
 */
@Configuration
@MapperScan(basePackages = "com.autohome.scheduler.mapper.matestore", sqlSessionTemplateRef  = "matestoreSqlSessionTemplate")
public class DataSource2Config {

    @Bean(name = "matestoreDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.matestore")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "matestoreSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("matestoreDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "matestoreTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("matestoreDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "matestoreSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("matestoreSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
