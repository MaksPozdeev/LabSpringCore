package org.shop.configuration;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitializerConfig {

    @Bean
    public DataInitializer dataInitializer() {
        DataInitializer dataInitializer = new DataInitializer();
        return dataInitializer;
    }

    @Bean
    public ProductInitializer productInitializer(ProductService productService) {
        ProductInitializer productInitializer = new ProductInitializer(productService);
        return productInitializer;
    }

    @Bean
    public ProposalInitializer proposalInitializer() {
        ProposalInitializer proposalInitializer = new ProposalInitializer();
        return proposalInitializer;
    }

    @Bean
    public SellerInitializer sellerInitializer() {
        SellerInitializer sellerInitializer = new SellerInitializer();
        return sellerInitializer;
    }

    @Bean
    public UserInitializer userInitializer(UserService userService) {
        UserInitializer userInitializer = new UserInitializer(userService);
        return userInitializer;
    }


}
