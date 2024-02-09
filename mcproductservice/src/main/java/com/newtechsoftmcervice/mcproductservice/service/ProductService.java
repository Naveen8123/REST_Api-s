package com.newtechsoftmcervice.mcproductservice.service;

import com.newtechsoftmcervice.mcproductservice.model.Product;
import com.newtechsoftmcervice.mcproductservice.productdto.ProductRequest;
import com.newtechsoftmcervice.mcproductservice.productdto.ProductResponce;
import com.newtechsoftmcervice.mcproductservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor// to dependency injection or can use @Autowired
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("product{} is saved", product.getId());
    }

    public List<ProductResponce> getAllProducts() {

        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();

    }

    private ProductResponce mapToProductResponse(Product product) {
        return ProductResponce.builder()
                .id((product.getId()))
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

}
