package org.shop.configuration;

import org.shop.api.*;
import org.shop.api.impl.*;
import org.shop.repository.ItemRepository;
import org.shop.repository.ProductRepository;
import org.shop.repository.ProposalRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ItemService itemService(ItemRepository itemRepository) {
        ItemService itemService = new ItemServiceImpl(itemRepository);
        return itemService;
    }

    @Bean
    public OrderService orderService() {
        OrderService orderService = new OrderServiceImpl();
        return orderService;
    }

    @Bean
    public ProductService productService(ProductRepository productRepository) {
        ProductService productService = new ProductServiceImpl(productRepository);
        return productService;
    }

    @Bean("proposalServiceBean")
    public ProposalService proposalService(ProposalRepository proposalRepository) {
        ProposalService proposalService = new ProposalServiceImpl(proposalRepository);
        return proposalService;
    }

    @Bean
    public SellerService sellerService() {
        SellerService sellerService = new SellerServiceImpl();
        return sellerService;
    }

    @Bean
    public UserService userService() {
        UserService userService = new UserServiceImpl();
        return userService;
    }

}
