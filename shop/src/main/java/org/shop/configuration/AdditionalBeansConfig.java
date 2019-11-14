package org.shop.configuration;

import org.shop.common.Sellers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AdditionalBeansConfig {

    @Bean
    public Map<Long, String> mapSellerNames() {
        Map<Long, String> mapSellerNames = new HashMap<>();
        mapSellerNames.put(1L, Sellers.AMAZON);
        mapSellerNames.put(2L, Sellers.SAMSUNG);
        return mapSellerNames;
    }

}
