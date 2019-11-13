package org.shop.configuration;

import org.shop.repository.*;
import org.shop.repository.factory.UserRepositoryFactory;
import org.shop.repository.map.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Configuration.properties")
public class RepositoryConfig {

    @Bean
    public AbstractMapRepository abstractMapRepository() {
        return new AbstractMapRepository();
    }

    @Bean
    public ItemRepository itemMapRepository() {
        return new ItemMapRepository();
    }

    @Bean
    public OrderRepository orderMapRepository(
            @Value("${intitialSequence}")
                    long intitialSequence) {
        OrderMapRepository orderMapRepository = new OrderMapRepository();
        orderMapRepository.setSequence(intitialSequence);
        return new OrderMapRepository();
    }

    @Bean
    public ProductRepository productMapRepository() {
        return new ProductMapRepository();
    }

    @Bean
    public ProposalRepository proposalMapRepository() {
        return new ProposalMapRepository();
    }

    @Bean
    public SellerRepository sellerMapRepository() {
        return new SellerMapRepository();
    }

    @Bean
    public UserRepository userRepository() {
        UserRepository userRepository = new UserRepositoryFactory().createUserRepository();
        return userRepository;
    }

}
