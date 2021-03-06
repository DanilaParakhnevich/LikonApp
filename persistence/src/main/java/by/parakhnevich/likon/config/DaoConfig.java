package by.parakhnevich.likon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Spring config class for dao layer.
 */
@Configuration
public class DaoConfig {
    @Bean
    @Primary
    LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean =
                new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan("by.parakhnevich.likon.entity");
        entityManagerFactoryBean.setJpaProperties(getHibernateProperties());
        return entityManagerFactoryBean;
    }

    @Bean
    EntityManagerFactory entityManagerFactory (LocalContainerEntityManagerFactoryBean managerFactoryBean) {
        return managerFactoryBean.getObject();
    }

    @Bean
    JpaTransactionManager transactionManager (LocalContainerEntityManagerFactoryBean factoryBean) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(factoryBean.getObject());
        return transactionManager;
    }

    private Properties getHibernateProperties() {
        try {
            Properties hibernateProperties = new Properties();
            InputStream is = getClass()
                    .getClassLoader()
                    .getResourceAsStream("properties/hibernate.properties");
            hibernateProperties.load(is);
            return hibernateProperties;

        } catch (IOException e) {
            throw new IllegalArgumentException("Can't find 'hibernate.properties' in classpath");
        }
    }

}
