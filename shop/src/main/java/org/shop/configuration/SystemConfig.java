package org.shop.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RepositoryConfig.class,
        ServiceConfig.class,
        InitializerConfig.class,
        FactoryConfig.class,
        AdditionalBeansConfig.class})
public class SystemConfig {
    //...
}
