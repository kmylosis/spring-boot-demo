package com.kmylosis.springboot.demo.adapter;

import com.kmylosis.springboot.demo.adapter.outbound.repository.SpringBootDemoJPABasePackage;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackageClasses = SpringBootDemoJPABasePackage.class)
@EntityScan(basePackageClasses = SpringBootDemoJPABasePackage.class)
@EnableTransactionManagement
public class DatabaseConfiguration {

}
