package com.rhythm.spring.factorybean;

import com.rhythm.spring.domain.Student;
import org.springframework.beans.factory.FactoryBean;

public class OcsFactoryBean implements FactoryBean<Student> {
    public Student getObject() throws Exception {
        return new Student();
    }

    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }
}
