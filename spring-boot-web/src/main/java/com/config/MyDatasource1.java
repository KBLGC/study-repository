package com.config;

import java.util.Properties;

import javax.annotation.ManagedBean;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

@Configuration
@MapperScan(basePackages="com.mapper.mapper1.**",sqlSessionTemplateRef="mySqlSessionTemplate1")
public class MyDatasource1 {
	  
	@Value("${spring.datasource.mysql1.url}")
	 private String url;
	 
	@Value("${spring.datasource.mysql1.username}")
	 private String username;
	 
	@Value("${spring.datasource.mysql1.password}")
	 private String password;
	 
	@Value("${spring.datasource.mysql1.driver}")
	 private String driver;
	 
	 @Bean(name="myDataSource1")
	 public DataSource myDataSource() throws Exception{
		Properties properties=new Properties();
		properties.put(DruidDataSourceFactory.PROP_URL, url);
		properties.put(DruidDataSourceFactory.PROP_USERNAME, username);
		properties.put(DruidDataSourceFactory.PROP_PASSWORD, password);
		properties.put(DruidDataSourceFactory.PROP_DRIVERCLASSNAME, driver);
		return DruidDataSourceFactory.createDataSource(properties);
		  
	 }
    
	 @Bean(name="mySqlSessionFactory1")
	 public SqlSessionFactory mySqlSessionFactory(@Qualifier("myDataSource1") DataSource dataSource) throws Exception{
		 SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
		 sqlSessionFactoryBean.setDataSource(dataSource);
		 sqlSessionFactoryBean.setConfiguration(null);
		 return sqlSessionFactoryBean.getObject();
	 }
	 
	 @Bean(name="myDataSourceTransactionManager1")
	 public DataSourceTransactionManager myDataSourceTransactionManager(@Qualifier("myDataSource1") DataSource dataSource){
		 return new DataSourceTransactionManager(dataSource);
	 }
	 
	 @Bean(name="mySqlSessionTemplate1")
	 public SqlSessionTemplate mySqlSessionTemplate(@Qualifier("mySqlSessionFactory1") SqlSessionFactory sqlSessionFactory){
		 return new SqlSessionTemplate(sqlSessionFactory);
	 }
}
