package org.shop;


import org.shop.configuration.SystemConfig;
import org.shop.data.*;
import org.shop.repository.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        //TODO: implement using Spring Framework ApplicationContext
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);

        System.out.println("========== UserRepository ==========");
        UserRepository userRepository = ctx.getBean(UserRepository.class);
        List<User> userList = userRepository.getUsers();
        System.out.println(userList);

        System.out.println("========== SellerRepository ==========");
        SellerRepository sellerRepository = ctx.getBean(SellerRepository.class);
        List<Seller> sellersList = sellerRepository.getSellers();
        System.out.println(sellersList);

        System.out.println("========== ProductRepository ==========");
        ProductRepository productRepository  = ctx.getBean(ProductRepository.class);
        List<Product> productList = productRepository.getProducts();
        System.out.println(productList);

        System.out.println("========== ProposalRepository ==========");
        ProposalRepository proposalRepository = ctx.getBean(ProposalRepository.class);
        List<Proposal> proposalList1 = proposalRepository.getProposalsByProductId(3L);
        List<Proposal> proposalList2 = proposalRepository.getProposalsBySellerId(1L);
        System.out.println(proposalList1);
        System.out.println(proposalList2);

        System.out.println("========== OrderRepository ==========");
        OrderRepository orderRepository = ctx.getBean(OrderRepository.class);
        List<Order> orderList1 = orderRepository.getOrdersByUserId(1L);
        List<Order> orderList2 = orderRepository.getOrdersByUserId(2L);
        System.out.println(orderList1);
        System.out.println(orderList2);

        System.out.println("========== ItemRepository ==========");
        ItemRepository itemRepository  = ctx.getBean(ItemRepository.class);
        List<Item> itemList = itemRepository.getItemsByOrderId(1L);
        System.out.println(itemList);

    }
}
