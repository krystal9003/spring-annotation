package com.rhythm.spring.config;

import com.rhythm.spring.domain.Student;
import com.rhythm.spring.factorybean.OcsFactoryBean;
import com.rhythm.spring.imp.MyImportDefinitionRegistar;
import com.rhythm.spring.imp.MyImportSeletor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Student.class, MyImportSeletor.class, MyImportDefinitionRegistar.class})
public class ImportConfig {

    @Bean
    public OcsFactoryBean ocsFactoryBean(){
        return new OcsFactoryBean();
    }

}
