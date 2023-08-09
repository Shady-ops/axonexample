package com.example.productService.command.api.events;

import com.example.productService.data.ProductEntity;
import com.example.productService.repository.ProductRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProductEventsHandler {


    private ProductRepository productRepository;

    public ProductEventsHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @EventHandler
    public void on(ProductCreatedEvent event){
        ProductEntity product = new ProductEntity();

        BeanUtils.copyProperties(event,product);

        productRepository.save(product);
    }
}
