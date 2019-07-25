package com.rhythm.spring.imp;

import com.rhythm.spring.domain.ImportBeanDefinitionRegistrarBean;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportDefinitionRegistar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(ImportBeanDefinitionRegistrarBean.class);
        beanDefinitionRegistry.registerBeanDefinition("registrar",rootBeanDefinition);
    }
}
