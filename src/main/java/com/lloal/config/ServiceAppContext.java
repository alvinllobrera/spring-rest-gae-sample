package com.lloal.config;

import com.lloal.services.SampleService;
import com.lloal.services.impl.SampleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class ServiceAppContext {

    @Bean(name="sampleService")
    public SampleService getSampleService() {
        return new SampleServiceImpl();
    }
}
